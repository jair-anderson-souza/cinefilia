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
import model.interfacesdaoifs.GrupoDaoIF;
import model.values.Grupo;

/**
 *
 * @author Anderson Souza
 */
public class GrupoDao implements GrupoDaoIF{

    @Override
    public boolean add(Grupo grupo) throws SQLException, ClassNotFoundException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "insert into grupo(nome_grupo, email_criador, descricao_textual) values(?, ?, ?);"; 
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setString(1, grupo.getNomeGrupo());
        prepared.setString(2, grupo.getEmailCriador());
        prepared.setString(3, grupo.getDescricaoTextual());
        return prepared.executeUpdate() > 0;
    }

    @Override
    public boolean update(Grupo grupo) throws SQLException, ClassNotFoundException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "update grupo set nome_grupo = ?,  email_criador = ?, descricao_textual = ? where id_grupo = ?;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setString(1, grupo.getNomeGrupo());
        prepared.setString(2, grupo.getEmailCriador());
        prepared.setString(3, grupo.getDescricaoTextual());
        prepared.setInt(4, grupo.getIdGrupo());
        return prepared.execute();
    }

    @Override
    public boolean delete(int id_grupo) throws SQLException, ClassNotFoundException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "delete from grupo where id_grupo = ?;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setInt(1, id_grupo);
        return prepared.execute();
    }

    @Override
    public List<Grupo> buscaGrupos() throws SQLException, ClassNotFoundException, ParseException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "select * from grupo;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        ResultSet rs = prepared.executeQuery();
        List<Grupo> lista = new ArrayList<>();
        
        while(rs.next()){
            Grupo g = new Grupo();
            g.setIdGrupo(rs.getInt(1));
            g.setNomeGrupo(rs.getString(2));
            g.setEmailCriador(rs.getString(3));
            g.setDescricaoTextual(rs.getString(4));
            lista.add(g);
        }
        return lista;
    }
}
