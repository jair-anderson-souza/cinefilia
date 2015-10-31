/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import gerenciadores.GerenciadorFilme;
import controllers.Command;
import gerenciadores.GerenciadorAtores;
import gerenciadores.GerenciadorDiretores;
import gerenciadores.GerenciadorGeneros;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
            String[] listaAtores = (String[]) request.getParameterValues("atores");
            String[] listaDiretores = (String[]) request.getParameterValues("diretores");
            String[] listaGeneros = (String[]) request.getParameterValues("genero");
            String titulo = request.getParameter("titulo");
            int ano = Integer.parseInt(request.getParameter("ano").toString().trim());
            response.getWriter().println(request.getParameter("ano"));
            String sinopse = request.getParameter("sinopse");
            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            String foto = request.getParameter("foto");
            
            Filme filme = new Filme(titulo, ano, sinopse, usuario.getEmail(), "fotoQQ");
            GerenciadorFilme gerenciador = new GerenciadorFilme();
            
            if (gerenciador.add(filme, usuario.getEmail())) {
                filme.setIdFilme(gerenciador.recuperaFilmeCompleto(filme));
                GerenciadorGeneros genero = new GerenciadorGeneros();
                genero.addGenero(filme, listaGeneros);
                
                GerenciadorAtores atores = new GerenciadorAtores();
                atores.addAtores(filme, listaAtores);
                
                GerenciadorDiretores diretores = new GerenciadorDiretores();
                diretores.addDiretores(filme, listaDiretores);
                
                request.setAttribute("filme", filme);
                request.getRequestDispatcher("index.jsp").forward(request, response);
//          
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
