/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import gerenciadores.GerenciadorUsuario;
import controllers.Command;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class AdicionarUsuarioCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            String primeiroNome = request.getParameter("primeiro");
            String segundoNome = request.getParameter("segundoNome");
            String apelido = request.getParameter("apelido");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String dataDeNascimento = request.getParameter("dataDeNascimento");
            String cidade = request.getParameter("cidade");
            String estado = request.getParameter("estado");
            String foto = request.getParameter("foto");
            
            Usuario usuario = new Usuario(primeiroNome, segundoNome, apelido, email, password, dataDeNascimento, cidade, estado, foto);
        
            
            GerenciadorUsuario gerenciador = new GerenciadorUsuario();

            if (gerenciador.addUsuario(usuario)) {
                HttpSession session = request.getSession();
                session.setMaxInactiveInterval(30 * 60);
                session.setAttribute("usuario", usuario);
                response.sendRedirect("home.jsp");
            } else {
                //dados invalidos
                response.sendRedirect("erro.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
