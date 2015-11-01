/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.conexao.Conexao;
import model.interfacesdaoifs.DiretoresDaoIF;
import model.values.Filme;

/**
 *
 * @author Anderson Souza
 */
public class DiretoresDao implements DiretoresDaoIF {
    
    public void addDiretores(Filme filme, String ator) throws SQLException, ClassNotFoundException{
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "insert into diretores_filmes(id_filme, nomeAtor) values(?, ?);"; 
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setInt(1, filme.getIdFilme());
        prepared.setString(2, ator);
        prepared.execute();
    }
    
}
