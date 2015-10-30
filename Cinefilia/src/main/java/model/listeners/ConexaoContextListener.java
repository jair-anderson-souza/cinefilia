/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author Anderson Souza
 */
public class ConexaoContextListener implements ServletContextListener {
    private Connection connection = null;
    
    @Override
    public void contextInitialized(ServletContextEvent event) {
        try {
            ServletContext context = event.getServletContext();
            String url = context.getInitParameter("url");
            String user = context.getInitParameter("user");
            String password = context.getInitParameter("password");
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            context.setAttribute("conexao", connection);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        
    }
    
    

}