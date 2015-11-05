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
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class EditarUsuarioCommand implements Command {

    //da p criar uma camada a mais aqui, qe sempre valida os dados - a exceçao CampoNuloException seria lançada
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            String primeiroNome = request.getParameter("primeiroNome");
            String segundoNome = request.getParameter("segundoNome");
            String apelido = request.getParameter("apelido");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String dataDeNascimento = request.getParameter("dataDeNascimento");
            String cidade = request.getParameter("cidade");
            String estado = request.getParameter("estado");
            
            Usuario user = new Usuario(primeiroNome, segundoNome, apelido, email, password, dataDeNascimento, cidade, estado, estado);
            GerenciadorUsuario gerenciador = new GerenciadorUsuario();
            
            if(gerenciador.editar(user, usuario.getEmail())) {
                request.getSession().setAttribute("usuario", user);
                response.sendRedirect("index.jsp");
            }else{
                response.sendRedirect("erro.jsp");
            }
            
            request.setAttribute("usuario", usuario);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
