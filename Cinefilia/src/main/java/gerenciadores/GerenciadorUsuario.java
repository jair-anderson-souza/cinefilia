/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.dao.AmizadeDao;
import model.dao.UsuarioDao;
import model.exceptions.CampoNuloException;
import model.interfacesdaoifs.AmizadeDaoIF;
import model.interfacesdaoifs.UsuarioDaoIF;
import model.values.Amizade;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class GerenciadorUsuario {

    private UsuarioDaoIF dao;
    private AmizadeDaoIF daoAmizade;

    public GerenciadorUsuario() {
        dao = new UsuarioDao();
        daoAmizade = new AmizadeDao();
    }

    public static void validaDadosUsuario(Usuario usuario) throws CampoNuloException {
        if (usuario != null) {
            if (usuario.getPrimeiroNome() != null && usuario.getPrimeiroNome().equals("")) {
                throw new CampoNuloException("Primeiro nome deve ser preenchido!");
            }
            if (usuario.getSegundoNome() != null && usuario.getSegundoNome().equals("")) {
                throw new CampoNuloException("Segundo nome deve ser preenchido!!");
            }
            if (usuario.getApelido() != null && usuario.getApelido().equals("")) {
                throw new CampoNuloException("Apelido deve ser preechido!! ");
            }
            if (usuario.getEmail() != null && usuario.getEmail().equals("")) {
                throw new CampoNuloException("Email deve ser preenchido!!");
            }
            if (usuario.getPassword() != null && usuario.getPassword().equals("")) {
                throw new CampoNuloException("A senha deve ser preenchida!! ");
            }
            if (usuario.getDataDeNascimento() != null && usuario.getDataDeNascimento().equals("")) {
                throw new CampoNuloException("A data de nascimento deve ser preenchida");
            }
            if (usuario.getCidade() != null && usuario.getCidade().equals("")) {
                throw new CampoNuloException("Cidade deve ser preenchido!!");
            }
            if (usuario.getEstado() != null && usuario.getEstado().equals("")) {
                throw new CampoNuloException("Estado deve ser preechido!! ");
            }
        }
    }

    public boolean addUsuario(Usuario usuario) {
        try {
            this.validaDadosUsuario(usuario);
            return dao.add(usuario);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Usuario> buscaUsuarios() {
        try {
            UsuarioDaoIF dao = new UsuarioDao();
            return dao.buscaUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Usuario validarLogin(String username, String senha) {
        try {
            List<Usuario> lista = this.buscaUsuarios();
            for (Usuario it : lista) {
                if (it.getEmail().equals(username) && it.getPassword().equals(senha) || it.getApelido().equals(username) && it.getPassword().equals(senha)) {
                    Usuario usuario = new Usuario();
                    usuario.setApelido(it.getApelido());
                    usuario.setCidade(it.getCidade());
                    usuario.setDataDeNascimento(it.getDataDeNascimento());
                    usuario.setEmail(it.getEmail());
                    usuario.setEstado(it.getEstado());
                    usuario.setFoto(it.getFoto());
                    usuario.setPassword(it.getPassword());
                    usuario.setPrimeiroNome(it.getPrimeiroNome());
                    usuario.setSegundoNome(it.getSegundoNome());
                    usuario.setTipo(it.isTipo());
                    return usuario;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean verificarPrevilegioUsuario(String email) {
        try {
            List<Usuario> lista = this.buscaUsuarios();
            for (Usuario it : lista) {
                if (it.getEmail().equals(email)) {
                    return it.isTipo();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean validaDados(String username, String senha){
        try {
            List<Usuario> lista = this.buscaUsuarios();
            for (Usuario it : lista) {
                if (it.getEmail().equals(username) && it.getPassword().equals(senha) || it.getApelido().equals(username) && it.getPassword().equals(senha)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean editar(Usuario usuario, String email) {
        try {
            this.validaDadosUsuario(usuario);
            return dao.update(usuario, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(String username, String senha) throws SQLException {
        try {
            if (this.validaDados(username, senha)) {
                return dao.delete(username);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private List<Amizade> listaTodasAsAmizades(String email) {
        try {
            List<Amizade> amigos = new ArrayList();
            List<Amizade> lista = daoAmizade.buscaAmizades();
            for (Amizade it : lista) {
                if (it.getEmailUsuario().equals(email)) {
                    amigos.add(it);
                }
            }
            return amigos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Usuario informacoesDoUsuario(String email){
        try{
            return dao.buscaUsuarioPorEmail(email);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;    
    }
    
    public List<Usuario> informacoesTodosDosUsuarios(String email) {
        try{
            return dao.buscaTodosOsUsuarioPorEmail(email);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;    
    }

    public List<Usuario> retornaAmigos(String email) {
        try {
            List<Amizade> listaAmizades = this.listaTodasAsAmizades(email);
            List<Usuario> listaAmigos = new ArrayList();
            List<Usuario> lista = new ArrayList();
            for (Amizade amizades : listaAmizades) {
                for (Usuario usuarios : listaAmigos) {
                    if(amizades.getEmailAmigo().equals(usuarios.getEmail()) && amizades.isAceito())
                        lista.add(usuarios);
                }
            }
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
