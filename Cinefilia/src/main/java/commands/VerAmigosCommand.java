/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import controllers.Command;
import gerenciadores.GerenciadorUsuario;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class VerAmigosCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            GerenciadorUsuario gerenciador = new GerenciadorUsuario();
            List<Usuario> amigos = gerenciador.retornaAmigos(usuario.getEmail());
            request.setAttribute("amigos", amigos);
            
            
            RequestDispatcher disp = request.getRequestDispatcher("verAmigos.jsp");
            disp.forward(request, response);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
