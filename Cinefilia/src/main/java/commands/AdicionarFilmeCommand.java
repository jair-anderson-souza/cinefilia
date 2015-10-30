/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import gerenciadores.GerenciadorFilme;
import controllers.Command;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.exceptions.FilmeException;
import model.values.Filme;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class AdicionarFilmeCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            String titulo = request.getParameter("titulo");
            int ano = Integer.parseInt(request.getParameter("ano"));
            String sinopse = request.getParameter("sinopse");
            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario"); 
            String foto = request.getParameter("foto");
            
            Filme filme = new Filme(titulo, ano, sinopse, foto, ano, usuario.getEmail());
            GerenciadorFilme gerenciador = new GerenciadorFilme();
            if(gerenciador.add(filme, usuario.getEmail())) {
                //tel q mostra o cadastro com sucesso do filme
                //request.setAttribute("filme", filme);
                response.sendRedirect("verFilmes.jsp");
            }else{
                response.sendRedirect("erro.jsp");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
