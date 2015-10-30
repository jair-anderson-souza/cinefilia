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
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class LoginUsuarioCommand implements Command {

    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            String username = request.getParameter("username");
            String senha = request.getParameter("senha");

            GerenciadorUsuario gerenciador = new GerenciadorUsuario();
            Usuario usuario = gerenciador.validarLogin(username, senha);
            if (usuario != null) {
                HttpSession session = request.getSession();
                session.setAttribute("usuario", usuario);
                response.sendRedirect("index.jsp");
            } else {
                request.getRequestDispatcher("erro.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
