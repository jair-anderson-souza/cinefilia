/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.util.List;
import model.dao.GrupoDao;
import model.interfacesdaoifs.GrupoDaoIF;
import model.values.Grupo;

/**
 *
 * @author Anderson Souza
 */
public class GrupoUtil {

    //public static List<Grupo> retornaGrupos(String email) {

//        //fazer store procedure retornando todos os grupos que usuarios participam passando o email do usuario
//        try {
//            ParticipaGrupoDaoIF dao = new ParticipaGrupoDao();
//            List<ParticipantesGrupo> listaDeParticipantes = dao.buscaParticipantes();
//            List<Integer> listaDeIdDeGrupos = new ArrayList();
//
//            if (listaDeParticipantes != null) {
//                for (ParticipantesGrupo it : listaDeParticipantes) {
//                    if (it.getId_usuario().equalsIgnoreCase(email)) {
//                        listaDeIdDeGrupos.add(it.getId_grupo());
//                    }
//                }
//            }
//
//            GrupoDaoIF daoGrupos = new GrupoDao();
//            List<Grupo> listaDeGrupos = daoGrupos.buscaGrupos();
//            List<Grupo> listaFinal = new ArrayList<>();
//
//            for (Grupo it : listaDeGrupos) {
////                if (it.getIdGrupo()) {
////                    if(listaDeParticipantes != null) {
////                        
//            }
//        }
//
//    }
//}
//catch (SQLException | ClassNotFoundException | ParseException e) {
//            e.printStackTrace();
//        } 
//        return null;
//    }
//}
//
    public static boolean validaGrupo(String nome) {
        try {
            GrupoDaoIF dao = new GrupoDao();
            List<Grupo> list = dao.buscaGrupos();

            if (list != null) {
                for (Grupo it : list) {
                    if (it.getNomeGrupo().equals(nome)) {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}
