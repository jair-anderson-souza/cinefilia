/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import controllers.Command;
import gerenciadores.GerenciadorFilme;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.values.Filme;

/**
 *
 * @author Anderson Souza
 */

public class RecuperaFilmesCommand implements Command {

    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {

            RequestDispatcher dispatcher = null;
            GerenciadorFilme gerenciador = new GerenciadorFilme();
            List<Filme> filmes = gerenciador.buscaTodosOsFilmes();
            request.getSession().setAttribute("filmesCadastrados", filmes);
            response.sendRedirect("verFilmes.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
