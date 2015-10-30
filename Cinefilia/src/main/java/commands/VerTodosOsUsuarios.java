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
public class VerTodosOsUsuarios implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        
        try{
            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            GerenciadorUsuario gerenciador = new GerenciadorUsuario();
            List<Usuario> listaUsuarios = gerenciador.informacoesTodosDosUsuarios(usuario.getEmail());
            request.setAttribute("usuariosCadastrados", listaUsuarios);
            request.getRequestDispatcher("verUsuarios.jsp").forward(request, response);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
