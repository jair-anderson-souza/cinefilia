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
public class AdicionarUsuarioAdministradorCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            Usuario usuarioLogado = (Usuario) request.getSession().getAttribute("usuario");

            String primeiroNome = request.getParameter("primeiroNome");
            String segundoNome = request.getParameter("segundoNome");
            String apelido = request.getParameter("apelido");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String dataDeNascimento = request.getParameter("dataDeNascimento");
            String cidade = request.getParameter("cidade");
            String estado = request.getParameter("estado");
            //String foto = request.getParameter("foto");

            Usuario usuario = new Usuario(primeiroNome, segundoNome, apelido, email, password, dataDeNascimento, cidade, estado, estado, true);
            GerenciadorUsuario gerenciador = new GerenciadorUsuario();

            if (gerenciador.verificarPrevilegioUsuario(usuarioLogado.getEmail())) {
                gerenciador.addUsuario(usuario);
                response.sendRedirect("addAdmin.jsp");
            } else {
                response.sendRedirect("erro.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
