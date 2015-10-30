/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import gerenciadores.GerenciadorUsuario;
import controllers.Command;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class VerPerfilUsuario implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        
        try{
            String id_usuario = request.getParameter("id");
            GerenciadorUsuario gerenciador = new GerenciadorUsuario();
            Usuario usuario = gerenciador.informacoesDoUsuario(id_usuario);
            request.setAttribute("perfil", usuario);
            request.getRequestDispatcher("perfil.jsp").forward(request, response);
                    
        }catch(Exception e){
            
        }
        
    }


    

    
    
}
