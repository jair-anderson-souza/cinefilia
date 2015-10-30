/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import controllers.Command;
import gerenciadores.GerenciadorUsuario;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 *
 * @author Anderson Souza
 */
public class DeleteUsuarioCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            GerenciadorUsuario gerenciador = new GerenciadorUsuario();
            if(gerenciador.delete(username, password)) {
                HttpSession session = request.getSession();
                session.invalidate();
                response.sendRedirect("index.jsp");
            }else response.sendRedirect("erro.jsp");
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
