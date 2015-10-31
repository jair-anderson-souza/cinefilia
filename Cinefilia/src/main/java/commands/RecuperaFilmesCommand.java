/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import controllers.Command;
import gerenciadores.GerenciadorFilme;
import java.util.List;
import javax.servlet.RequestDispatcher;
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
            request.setAttribute("filmesCadastrados", filmes);
            request.getRequestDispatcher("verFilmes.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
