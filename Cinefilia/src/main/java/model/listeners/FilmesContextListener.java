/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.listeners;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import model.dao.FilmeDao;
import model.interfacesdaoifs.FilmeDaoIF;
import model.values.Filme;

/**
 *
 * @author Anderson Souza
 */

public class FilmesContextListener implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent event) {
        try {
            ServletContext context = event.getServletContext();
            FilmeDaoIF dao = new FilmeDao();
            List<Filme> list = dao.buscaFilmes();
            if(list != null) context.setAttribute("filmes", list);
            
        } catch (ClassNotFoundException |SQLException | ParseException ex) {
            ex.printStackTrace();
        } 
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        
    }
    
    
    
}
