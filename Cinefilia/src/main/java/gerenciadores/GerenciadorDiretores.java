/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import model.dao.DiretoresDao;
import model.interfacesdaoifs.DiretoresDaoIF;
import model.values.Filme;

/**
 *
 * @author anderson
 */
public class GerenciadorDiretores {
    private DiretoresDaoIF dao;

    public GerenciadorDiretores() {
        dao = new DiretoresDao();
    }
    
    public void addDiretores(Filme filme, String[] diretores){
        try{
            for(String it : diretores){
                dao.addDiretores(filme, it);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
}
