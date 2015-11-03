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
public class Amizade {
    private String emailUsuario;
    private String emailAmigo;
    private boolean aceito;

    public Amizade() {
    }

    public Amizade(String emailUsuario, String emailAmigo, boolean aceito) {
        this.emailUsuario = emailUsuario;
        this.emailAmigo = emailAmigo;
        this.aceito = aceito;
    }
    
    
    
    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getEmailAmigo() {
        return emailAmigo;
    }

    public void setEmailAmigo(String emailAmigo) {
        this.emailAmigo = emailAmigo;
    }

    public boolean isAceito() {
        return aceito;
    }

    public void setAceito(boolean aceito) {
        this.aceito = aceito;
    }
    
    
    
    
}
