/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import gerenciadores.GerenciadorFilme;
import controllers.Command;
import gerenciadores.GerenciadorGeneros;
import java.util.List;
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
            String[] listaGeneros = (String[]) request.getParameterValues("genero");
            String titulo = request.getParameter("titulo");
            Integer ano = Integer.parseInt(request.getParameter("ano"));
            String sinopse = request.getParameter("sinopse");
            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            String foto = request.getParameter("foto");
            
            //response.getWriter().println(listaGeneros.length);
            
            Filme filme = new Filme(titulo, ano, sinopse, usuario.getEmail(), String foto);
            GerenciadorFilme gerenciador = new GerenciadorFilme();
            if (gerenciador.add(filme, usuario.getEmail())) {
                filme = gerenciador.recuperaFilmeCompleto(filme);
                response.getWriter().println(filme.getIdFilme());
            }
//                Filme filme2 = gerenciador.recuperaFilmeCompleto(filme);
//                GerenciadorGeneros genero = new GerenciadorGeneros();
//                genero.addGenero(filme, listaGeneros);
//                
//                request.setAttribute("filme", filme);
//                request.getRequestDispatcher("cadastrarGenero.jsp").forward(request, response);
//                
//            } else {
//                response.sendRedirect("erro.jsp");
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
