/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import model.dao.AtoresDao;
import model.interfacesdaoifs.AtoresDaoIF;
import model.values.Filme;

/**
 *
 * @author Anderson Souza
 */
public class GerenciadorAtores {
    private AtoresDaoIF dao;

    public GerenciadorAtores() {
        dao = new AtoresDao();
    }
    
    
    public void addAtores(Filme filme, String[] listaAtores){
        try{
            for(String it : listaAtores){
                dao.addAtores(filme, it);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
