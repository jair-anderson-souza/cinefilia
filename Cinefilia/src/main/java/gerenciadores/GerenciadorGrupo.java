/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import java.util.ArrayList;
import java.util.List;
import model.dao.GrupoDao;
import model.dao.ParticipaGrupoDao;
import model.exceptions.CampoNuloException;
import model.interfacesdaoifs.GrupoDaoIF;
import model.interfacesdaoifs.ParticipaGrupoDaoIF;
import model.values.Grupo;
import model.values.ParticipantesGrupo;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class GerenciadorGrupo {

    private GrupoDaoIF dao;
    private ParticipaGrupoDaoIF daoParticipantes;

    public GerenciadorGrupo() {
        dao = new GrupoDao();
        daoParticipantes = new ParticipaGrupoDao();
    }

    public int retornaGrupo(String nome_grupo) {
        try {
            List<Grupo> listaDeGrupos = dao.buscaGrupos();
            for (Grupo it : listaDeGrupos) {
                if (it.getNomeGrupo().equals(nome_grupo)) {
                    return it.getIdGrupo();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void validaDadosDoGrupo(Grupo grupo) throws CampoNuloException {
        if (grupo != null) {
            if (grupo.getDescricaoTextual() != null && grupo.getDescricaoTextual().equals("")) {
                throw new CampoNuloException("A descrição textual deve ser preenchida!");
            }
            if (grupo.getNomeGrupo() != null && grupo.getNomeGrupo().equals("")) {
                throw new CampoNuloException("O nome do grupo deve ser preenchido!");
            }
        }
    }

    public boolean add(Grupo grupo, Usuario usuario) {
        try {
            this.validaDadosDoGrupo(grupo);
            return dao.add(grupo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<Grupo> meusGrupos(String email) {
        try{
            List<Integer> lista = this.listaTodosOsGrupos(email);
            List<Grupo> listaFinal = new ArrayList();
            List<Grupo> listaGrupos = dao.buscaGrupos();
            for (int i = 0; i < lista.size(); i++) {
                for (Grupo grupo : listaGrupos) {
                    if(lista.get(i) == grupo.getIdGrupo()){
                        listaFinal.add(grupo);
                    }
                }
            }
            return listaFinal;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Grupo> listaTodosOsGrupos() {
        try {
            return dao.buscaGrupos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Integer> listaTodosOsGrupos(String email) {
        try {
            List<Integer> listaMeusGrupos = new ArrayList();
            List<ParticipantesGrupo> participantes = daoParticipantes.buscaParticipantes();

            for (ParticipantesGrupo it : participantes) {
                if (email.equals(it.getId_usuario())) {
                    listaMeusGrupos.add(it.getId_grupo());
                }
            }
            return listaMeusGrupos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

