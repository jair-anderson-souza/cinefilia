/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import java.util.List;
import model.dao.AmizadeDao;
import model.interfacesdaoifs.AmizadeDaoIF;
import model.values.Amizade;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class GerenciadorAmizade {
    private AmizadeDaoIF dao;
    
    public GerenciadorAmizade() {
        dao = new AmizadeDao();
    }
                
    public List<String> verSolicitacoes(Usuario usuario){
        try{
            List<String> listaSolicitacoes = null;
            List<Amizade> listaAmigos = dao.buscaAmizades();
            List<Usuario> listaUsuarios = new GerenciadorUsuario().buscaUsuarios();
            for (Amizade amigo : listaAmigos) {
                if(amigo.getEmailAmigo().equals(usuario.getEmail()) && !(amigo.isAceito())){
                    listaSolicitacoes.add(amigo.getEmailUsuario());
                }
            }
            return listaSolicitacoes;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public void enviarSolicitacaoAmizade(Usuario usuario, String email, boolean convite){
        try{
            dao.add(usuario, email, convite);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
