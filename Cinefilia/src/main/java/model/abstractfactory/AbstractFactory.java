/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.abstractfactory;

import commands.ParticipaGrupoCommand;
import model.interfacesdaoifs.AmizadeDaoIF;
import model.interfacesdaoifs.FilmeDaoIF;
import model.interfacesdaoifs.ParticipaGrupoDaoIF;
import model.interfacesdaoifs.UsuarioDaoIF;

/**
 *
 * @author Anderson Souza
 */
public abstract class AbstractFactory {
    
    public abstract UsuarioDaoIF createDaoUsuario();
    
    public abstract FilmeDaoIF createDaoFilme();
    
    public abstract AmizadeDaoIF createDaoAmizade();
    
    public abstract ParticipaGrupoDaoIF createDaoParticipaGrupo();
        
}
