/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.interfacesdaoifs;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import model.values.Amizade;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public abstract class AmizadeDaoIF {
    
    public abstract boolean add(Usuario usuario, String email, boolean aceito) throws SQLException, ClassNotFoundException;

    public abstract boolean update() throws SQLException, ClassNotFoundException;

    public abstract boolean delete() throws SQLException, ClassNotFoundException;

    public abstract List<Amizade> buscaAmizades() throws SQLException, ClassNotFoundException, ParseException;
    
}
