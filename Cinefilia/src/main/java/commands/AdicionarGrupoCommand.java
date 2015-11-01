/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import controllers.Command;
import gerenciadores.GerenciadorParticipacaoGrupo;
import gerenciadores.GerenciadorGrupo;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.values.Grupo;
import model.values.Usuario;


/**
 *
 * @author Anderson Souza
 */
public class AdicionarGrupoCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher disp = null;
        try {
            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            
            String nome = request.getParameter("nomeGrupo");
            String descricao = request.getParameter("descricaoTextual");
            
            Grupo grupo = new Grupo(nome, usuario.getEmail(), descricao);
            GerenciadorGrupo gerenciador = new GerenciadorGrupo();
            
            if(gerenciador.add(grupo, usuario)){
                int id = gerenciador.retornaGrupo(grupo.getNomeGrupo());
                response.getWriter().println(id);
            }
//                GerenciadorParticipacaoGrupo gerenciadorParticipacao = new GerenciadorParticipacaoGrupo();
//                gerenciadorParticipacao.add(id, usuario.getEmail());
//                response.sendRedirect("home.jsp");
//            }else response.sendRedirect("erro.jsp");
//            
            
        }catch(Exception e){
        e.printStackTrace();
        }
    }
}