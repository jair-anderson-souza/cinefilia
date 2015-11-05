/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import controllers.Command;
import gerenciadores.GerenciadorFilme;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.values.Filme;

/**
 *
 * @author Anderson Souza
 */
public class ConsultaFilmeCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            int id_filme = Integer.parseInt(request.getParameter("id"));
            GerenciadorFilme gerenciador = new GerenciadorFilme();
            Filme filme = gerenciador.buscaFilme(id_filme);
            if(filme != null){
                request.setAttribute("filme", filme);
                request.getRequestDispatcher("sobreFilme.jsp").forward(request, response);
            }else {
                request.getRequestDispatcher("erro.jsp").forward(request, response);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
