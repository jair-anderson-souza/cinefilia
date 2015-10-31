/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import java.sql.SQLException;
import java.util.List;
import model.dao.FilmeDao;
import model.exceptions.CampoNuloException;
import model.interfacesdaoifs.FilmeDaoIF;
import model.values.Filme;

/**
 *
 * @author Anderson Souza
 */
public class GerenciadorFilme {
    private FilmeDaoIF dao;
    private GerenciadorUsuario gerenciadorUsuario;

    public GerenciadorFilme() {
        dao = new FilmeDao();
        gerenciadorUsuario = new GerenciadorUsuario();
    }
     
    public void validaFilme(Filme filme) throws CampoNuloException {
        if (filme  != null) {
            if (filme.getAno() == 0) {
                throw new CampoNuloException("O ano deve ser preenchido!");
            }
            if (filme.getIdUsuario() != null && filme.getIdUsuario().equals("")) {
                throw new CampoNuloException("Erro de usuario ID!! ");
            }
            if (filme.getSinopse() != null && filme.getSinopse().equals("")) {
                throw new CampoNuloException("Sinopse deve ser preenchido!!");
            }
            if (filme.getTitulo() != null && filme.getTitulo().equals("")) {
                throw new CampoNuloException("O titulo deve ser preenchida!! ");
            }
        }
    }
    
    public boolean add(Filme filme, String email) throws CampoNuloException, SQLException, ClassNotFoundException {
        this.validaFilme(filme);
        if(gerenciadorUsuario.verificarPrevilegioUsuario(email)) {
            
            return dao.add(filme);
            
        }
        return false;
    }
    
    public List<Filme> buscaTodosOsFilmes(){
        try{
            return dao.buscaFilmes();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Filme buscaFilme(int id_filme) {
        try{
            List<Filme> lista = this.buscaTodosOsFilmes();
            for (Filme it  : lista) {
                if(it.getIdFilme() == id_filme){
                    return new Filme(it.getTitulo(), it.getAno(), it.getSinopse(), it.getFoto(), id_filme, it.getIdUsuario());
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Filme> buscaFilme(String titulo){
        try{
            return dao.buscaFilmePorTitulo(titulo);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public int recuperaFilmeCompleto(Filme filme) {
        try{
            return dao.buscaIdFilmePorDados(filme);
        }catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    
    
}
