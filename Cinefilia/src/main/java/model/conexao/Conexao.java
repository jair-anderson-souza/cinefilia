/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Anderson Souza
 */
public class Conexao {
    private String url = null;
    private String user = null;
    private String password = null;

    public Conexao() {
        this.url = "jdbc:mysql://localhost:3306/psd";
        this.user = "root";
        this.password = "12345";
    }
    
    
    public Connection open() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/psd", "root", "12345");
    }
    
    public Connection close(){
        return null;
    }
}
