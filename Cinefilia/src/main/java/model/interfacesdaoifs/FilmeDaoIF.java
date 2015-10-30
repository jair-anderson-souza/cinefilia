/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.interfacesdaoifs;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import model.values.Filme;

/**
 *
 * @author Anderson Souza
 */
public interface FilmeDaoIF {
    
    public boolean add(Filme filme) throws SQLException, ClassNotFoundException;
    
    public boolean update(Filme filme) throws SQLException, ClassNotFoundException;
    
    public boolean delete(int id_filme) throws SQLException, ClassNotFoundException;
    
    public List<Filme> buscaFilmes() throws SQLException, ClassNotFoundException, ParseException;
    
    public List<Filme> buscaFilmePorTitulo(String titulo) throws SQLException, ClassNotFoundException, ParseException;
    
     public Filme buscaIdFilmePorDados(Filme filme) throws SQLException, ClassNotFoundException, ParseException;
    
}
