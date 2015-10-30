/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import model.dao.GeneroDao;
import model.interfacesdaoifs.GeneroDaoIF;
import model.values.Filme;

/**
 *
 * @author Anderson Souza
 */
public class GerenciadorGeneros {
    private GeneroDaoIF dao;

    public GerenciadorGeneros() {
        dao = new GeneroDao();
    }
    
    public void addGenero(Filme filme, String[] listaGeneros){
        try{
            for(String it : listaGeneros){
                dao.addGeneros(filme, it);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
}
