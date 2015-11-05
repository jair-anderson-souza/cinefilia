/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import controllers.Command;
import gerenciadores.GerenciadorGrupo;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.values.Grupo;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class RecuperaGruposCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        
        try{
            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            GerenciadorGrupo gerenciador = new GerenciadorGrupo();
            List<Grupo> listaGrupos = gerenciador.listaTodosOsGrupos();
            request.setAttribute("grupos", listaGrupos);
            request.getRequestDispatcher("verGrupos.jsp").forward(request, response);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    
}
