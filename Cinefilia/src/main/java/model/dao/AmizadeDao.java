/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import model.conexao.Conexao;
import model.interfacesdaoifs.AmizadeDaoIF;
import model.values.Amizade;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class AmizadeDao extends AmizadeDaoIF {

    @Override
    public boolean add(Usuario usuario, String email) throws SQLException, ClassNotFoundException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "insert into relacionar_amigo(email_usuario, email_amigo, aceito) values(?, ?, ?);"; 
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setString(1, usuario.getEmail());
        prepared.setString(2, email);
        return prepared.executeUpdate() > 0;
    }

    @Override
    public boolean update() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Amizade> buscaAmizades() throws SQLException, ClassNotFoundException, ParseException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "select * from relacionar_amigo;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        ResultSet rs = prepared.executeQuery();
        List<Amizade> lista = new ArrayList<>();
        
        while(rs.next()){
            Amizade amizade = new Amizade();
            amizade.setEmailUsuario(rs.getString(1));
            amizade.setEmailAmigo(rs.getString(2));
            amizade.setAceito(rs.getBoolean(3));
            lista.add(amizade);
        }
        return lista;
    }
    
}
