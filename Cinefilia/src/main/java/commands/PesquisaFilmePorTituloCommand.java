/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import controllers.Command;
import gerenciadores.GerenciadorFilme;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.values.Filme;

/**
 *
 * @author Anderson Souza
 */
public class PesquisaFilmePorTituloCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            String busca = request.getParameter("pesquisa");
            GerenciadorFilme gerenciador = new GerenciadorFilme();
            List<Filme> listaDeFilmes = gerenciador.buscaFilme(busca);
            request.setAttribute("buscaFilmes", listaDeFilmes);
            request.setAttribute("termoConsulta", busca);
            request.getRequestDispatcher("busca.jsp").forward(request, response);
            
       }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
}
