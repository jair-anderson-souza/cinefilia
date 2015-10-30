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

public class Grupo {
    private int idGrupo;
    private String nomeGrupo;
    private String emailCriador;
    private String descricaoTextual;

    public Grupo(String nomeGrupo, String emailCriador, String descricaoTextual) {
        this(nomeGrupo, descricaoTextual);
        this.emailCriador = emailCriador;
    }
    
    
    public Grupo(String nomeGrupo, String descricaoTextual) {
        this.nomeGrupo = nomeGrupo;
        this.descricaoTextual = descricaoTextual;
    }
   
    public Grupo(int idGrupo, String nomeGrupo, String emailCriador, String descricaoTextual) {
        this(nomeGrupo, descricaoTextual);
        this.idGrupo = idGrupo;
        this.emailCriador = emailCriador;
        
    }
    
    public Grupo() {
    }

   

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public String getEmailCriador() {
        return emailCriador;
    }

    public void setEmailCriador(String emailCriador) {
        this.emailCriador = emailCriador;
    }

    public String getDescricaoTextual() {
        return descricaoTextual;
    }

    public void setDescricaoTextual(String descricaoTextual) {
        this.descricaoTextual = descricaoTextual;
    }
    
    
    
    
}
