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
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import model.dao.FilmeDao;
import model.interfacesdaoifs.FilmeDaoIF;
import model.values.Filme;

/**
 *
 * @author jairanderson
 */
public class FilmeAdicionadoListener implements ServletContextAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
         
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        try {
            ServletContext context = event.getServletContext();
            FilmeDaoIF dao = new FilmeDao();
            List<Filme> list = dao.buscaFilmes();
            if(list != null) context.setAttribute("filmes", list);
            
        } catch (ClassNotFoundException |SQLException | ParseException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}
