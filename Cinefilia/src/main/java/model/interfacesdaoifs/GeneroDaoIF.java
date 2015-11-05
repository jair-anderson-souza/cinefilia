/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.interfacesdaoifs;

import java.sql.SQLException;
import model.values.Filme;

/**
 *
 * @author anderson
 */
public interface GeneroDaoIF {
    
    public void addGeneros(Filme filme, String genero) throws SQLException, ClassNotFoundException;
}
