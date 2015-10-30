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
public class ParticipantesGrupo {
    private int id_grupo;
    private String id_usuario;

    public ParticipantesGrupo(int id_grupo, String id_usuario) {
        this.id_grupo = id_grupo;
        this.id_usuario = id_usuario;
    }

    public ParticipantesGrupo() {
        
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

}