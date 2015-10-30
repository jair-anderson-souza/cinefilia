/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.exceptions;

/**
 *
 * @author Anderson Souza
 */
public class CampoNuloException extends Exception{

    public CampoNuloException() {
    }

    public CampoNuloException(String message) {
        super(message);
    }

    public CampoNuloException(Throwable cause) {
        super(cause);
    }

    public CampoNuloException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
