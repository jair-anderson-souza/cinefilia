/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.FilmeDao;
import model.interfacesdaoifs.FilmeDaoIF;
import model.values.Filme;

/**
 *
 * @author Anderson Souza
 */
public class FilmeUtil {

    public static boolean verificaDuplicidadeDeFilmes(String titulo, String sinopse, int ano) {
        try {
            FilmeDaoIF dao = new FilmeDao();
            List<Filme> list = dao.buscaFilmes();
            if (list != null) {
                for (Filme it : list) {
                    if (it.getTitulo().equalsIgnoreCase(titulo) && it.getSinopse().equalsIgnoreCase(sinopse) && it.getAno() == ano) {
                        return false;
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException | ParseException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static Filme buscarFilme(int id_filme) {
        try {
            FilmeDaoIF dao = new FilmeDao();
            List<Filme> list = dao.buscaFilmes();
            if (list != null) {
                //
                for (Filme it : list) {
                    if (it.getIdFilme() == id_filme) {
                        String email = it.getIdUsuario();
                        int ano = it.getAno();
                        String foto = it.getFoto();
                        String sinopse = it.getSinopse();
                        String titulo = it.getTitulo();
                        return new Filme(titulo, ano, sinopse, foto, id_filme, email);
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException | ParseException e) {
            e.printStackTrace();
        }
        return null;

    }
}
