/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.interfacesdaoifs;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Anderson Souza
 */
public abstract class ParticipaGrupoDaoIF {
    
    public abstract List buscaParticipantes() throws ClassNotFoundException, SQLException;
    
    public abstract void addParticipantes(int id_grupo, String email) throws ClassNotFoundException, SQLException;
}
