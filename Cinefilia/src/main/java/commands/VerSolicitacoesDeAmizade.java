/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import controllers.Command;
import gerenciadores.GerenciadorAmizade;
import gerenciadores.GerenciadorUsuario;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class VerSolicitacoesDeAmizade implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            GerenciadorAmizade gerenciador = new GerenciadorAmizade();
            List<String> listaEmailsDosUsuarios = gerenciador.verSolicitacoes(usuario);
            GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();
            List<Usuario> listaSolicitacoesGeral = null;
            for (String it : listaEmailsDosUsuarios) {
                listaSolicitacoesGeral.add(gerenciadorUsuario.informacoesDoUsuario(it));
            }
            request.setAttribute("solicitacoes", listaSolicitacoesGeral);
            request.getRequestDispatcher("verSolicitacoes.jsp").forward(request, response);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    
}
