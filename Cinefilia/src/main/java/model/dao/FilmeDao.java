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
import model.interfacesdaoifs.FilmeDaoIF;
import model.values.Filme;

/**
 *
 * @author Anderson Souza
 */
public class FilmeDao implements FilmeDaoIF{
    

    public FilmeDao() {}
    
    
    @Override
    public boolean add(Filme filme) throws SQLException, ClassNotFoundException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "insert into filme(titulo, ano, sinopse, foto, id_usuario) values(?, ?, ?, ?, ?);"; 
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setString(1, filme.getTitulo());
        prepared.setInt(2, filme.getAno());
        prepared.setString(3, filme.getSinopse());
        prepared.setString(4, filme.getFoto());
        prepared.setString(5, filme.getIdUsuario());
        return prepared.executeUpdate() > 0;
    }

    @Override
    public boolean update(Filme filme) throws SQLException, ClassNotFoundException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "update usuario set titulo  = ?, ano = ?,  sinopse = ?, foto = ? where id_filme = ?;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setString(1, filme.getTitulo());
        prepared.setInt(2, filme.getAno());
        prepared.setString(3, filme.getSinopse());
        prepared.setString(4, filme.getFoto());
        prepared.setInt(5, filme.getIdFilme());
        return prepared.execute();
    }

    @Override
    public boolean delete(int id_filme) throws SQLException, ClassNotFoundException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "delete from filme where id_filme = ?;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setInt(1, id_filme);
        return prepared.execute();
    }
    
    public Filme buscaIdFilmePorDados(Filme filme) throws SQLException, ClassNotFoundException{
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String titulo = filme.getTitulo();
        String sinopse = filme.getSinopse();
        int ano = filme.getAno();
        String sql = "select * from filme where titulo=" + titulo + " and sinopse = " + sinopse + " and ano = " + ano + ";";
        PreparedStatement prepared = connection.prepareStatement(sql);
        ResultSet rs = prepared.executeQuery();
        filme.setIdFilme(rs.getInt("id_filme"));
        return filme;
    }
    
    public List<Filme> buscaFilmePorTitulo(String titulo) throws SQLException, ClassNotFoundException, ParseException{
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "select * from filme where titulo like '%"+titulo+"%';";
        PreparedStatement prepared = connection.prepareStatement(sql);
        ResultSet rs = prepared.executeQuery();
        List<Filme> lista = new ArrayList<>();
        
        while(rs.next()){
            Filme filme = new Filme();
            filme.setTitulo(rs.getString("titulo"));
            filme.setAno(rs.getInt("ano"));
            filme.setSinopse(rs.getString("sinopse"));
            filme.setFoto(rs.getString("foto"));
            filme.setIdFilme(rs.getInt("id_filme"));
            filme.setIdUsuario(rs.getString("id_usuario"));
            lista.add(filme);
        }
        return lista;
    }

    @Override
    public List<Filme> buscaFilmes() throws SQLException, ClassNotFoundException, ParseException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "select * from filme;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        ResultSet rs = prepared.executeQuery();
        List<Filme> lista = new ArrayList<>();
        
        while(rs.next()){
            Filme filme = new Filme();
            filme.setTitulo(rs.getString("titulo"));
            filme.setAno(rs.getInt("ano"));
            filme.setSinopse(rs.getString("sinopse"));
            filme.setFoto(rs.getString("foto"));
            filme.setIdFilme(rs.getInt("id_filme"));
            filme.setIdUsuario(rs.getString("id_usuario"));
            lista.add(filme);
        }
        return lista;
    }
    
}
