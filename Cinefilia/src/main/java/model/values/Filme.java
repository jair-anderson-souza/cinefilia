/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.values;

/**
 *
 * @author Anderson Souza
 */
public class Filme {
    private String titulo;
    private int	ano;
    private String sinopse;
    private String foto;
    private int idFilme;
    private String idUsuario;

    public Filme() {
    }

    
    public Filme(String titulo, int ano, String sinopse, String foto, int id_filme, String id_usuario) {
        this(titulo, ano, sinopse, foto, id_usuario);
        this.idFilme = id_filme;
    }
    
    public Filme(String titulo, int ano, String sinopse, String foto, String idUsuario) {
        this.titulo = titulo;
        this.ano = ano;
        this.sinopse = sinopse;
        this.foto = foto;
        this.idUsuario = idUsuario;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int IdFilme) {
        this.idFilme = IdFilme;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
    
    
}
