/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.interfacesdaoifs;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import model.values.Grupo;

/**
 *
 * @author Anderson Souza
 */
public interface GrupoDaoIF {

    public boolean add(Grupo grupo) throws SQLException, ClassNotFoundException;

    public boolean update(Grupo grupo) throws SQLException, ClassNotFoundException;

    public boolean delete(int id_grupo) throws SQLException, ClassNotFoundException;

    public List<Grupo> buscaGrupos() throws SQLException, ClassNotFoundException, ParseException;

}
