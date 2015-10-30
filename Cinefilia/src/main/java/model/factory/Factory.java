/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factory;

import model.abstractfactory.AbstractFactory;
import model.dao.AmizadeDao;
import model.dao.FilmeDao;
import model.dao.GrupoDao;
import model.dao.ParticipaGrupoDao;
import model.dao.UsuarioDao;
import model.interfacesdaoifs.AmizadeDaoIF;
import model.interfacesdaoifs.FilmeDaoIF;
import model.interfacesdaoifs.GrupoDaoIF;
import model.interfacesdaoifs.ParticipaGrupoDaoIF;
import model.interfacesdaoifs.UsuarioDaoIF;

/**
 *
 * @author Anderson Souza
 */
public class Factory extends AbstractFactory{

    @Override
    public UsuarioDaoIF createDaoUsuario() {
        return new UsuarioDao();
    }
    

    @Override
    public FilmeDaoIF createDaoFilme() {
        return new FilmeDao();
    }
    
    public GrupoDaoIF createDaoGrupo(){
        return new GrupoDao();
    }

    @Override
    public AmizadeDaoIF createDaoAmizade() {
        return new AmizadeDao();
    }
    
    @Override
    public ParticipaGrupoDaoIF createDaoParticipaGrupo(){
        return new ParticipaGrupoDao();
    }
    
    
}
