/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import model.dao.ParticipaGrupoDao;
import model.interfacesdaoifs.ParticipaGrupoDaoIF;

/**
 *
 * @author Anderson Souza
 */
public class GerenciadorParticipacaoGrupo {
    private ParticipaGrupoDaoIF dao;

    public GerenciadorParticipacaoGrupo() {
        dao = new ParticipaGrupoDao();
    }
    
    
    public void add(int id_grupo, String email){
        try{
            dao.addParticipantes(id_grupo, email);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
