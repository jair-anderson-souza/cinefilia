/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import controllers.Command;
import gerenciadores.GerenciadorAmizade;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class AdicionarAosAmigosCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            String convite = request.getParameter("email");
            
            GerenciadorAmizade gerenciador = new GerenciadorAmizade();
            gerenciador.enviarSolicitacaoAmizade(usuario, convite, false);
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
}
