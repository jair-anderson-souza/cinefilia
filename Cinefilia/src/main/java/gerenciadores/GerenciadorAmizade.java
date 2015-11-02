/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import model.dao.AmizadeDao;
import model.interfacesdaoifs.AmizadeDaoIF;
import model.values.Usuario;

/**
 *
 * @author anderson
 */
public class GerenciadorAmizade {
    private AmizadeDaoIF dao;
    
    public GerenciadorAmizade() {
        dao = new AmizadeDao();
    }
    
    
    
    public void enviarSolicitacaoAmizade(Usuario usuario, String email){
        try{
            dao.add(usuario, email);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
