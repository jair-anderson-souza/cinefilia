/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.exceptions;

/**
 *
 * @author anderson
 */
public class FilmeException extends Exception {

    public FilmeException() {
    }

    public FilmeException(String message) {
        super(message);
    }

    public FilmeException(Throwable cause) {
        super(cause);
    }

    public FilmeException(String message, Throwable cause) {
        super(message, cause);
    }

    
    
}
