/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.sql.SQLException;
import java.util.List;
import model.dao.UsuarioDao;
import model.exceptions.CampoNuloException;
import model.interfacesdaoifs.UsuarioDaoIF;
import model.values.Usuario;

/**
 *
 * @author Anderson Souza
 */
public class UsuarioUtil {
    
    public static Usuario buscaUsuario(String email){
        try {
            UsuarioDaoIF dao = new UsuarioDao();
            List<Usuario> lista = dao.buscaUsuarios();

            for (Usuario it : lista) {
                if (it.getEmail().equals(email)) {
                    String primeiroNome = it.getPrimeiroNome();
                    String segundoNome = it.getSegundoNome();
                    String apelido = it.getApelido();
                    String senha = it.getPassword();
                    String cidade = it.getCidade();
                    String dataNascimento = it.getDataDeNascimento();
                    String estado = it.getEstado();
                    String foto = it.getFoto();
                    boolean tipo = it.isTipo();
                    return new Usuario(primeiroNome, segundoNome, apelido, email, senha, dataNascimento, cidade, estado, foto, tipo);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }        

    public static Usuario verificarLogin(String username, String senha) {
        try {
            UsuarioDaoIF dao = new UsuarioDao();
            List<Usuario> lista = dao.buscaUsuarios();

            for (Usuario it : lista) {
                if (it.getEmail().equals(username) && it.getPassword().equals(senha) || it.getApelido().equals(username) && it.getPassword().equals(senha)) {
                    String primeiroNome = it.getPrimeiroNome();
                    String segundoNome = it.getSegundoNome();
                    String apelido = it.getApelido();
                    String cidade = it.getCidade();
                    String dataNascimento = it.getDataDeNascimento();
                    String estado = it.getEstado();
                    String foto = it.getFoto();
                    String email = it.getEmail();
                    boolean tipo = it.isTipo();
                    return new Usuario(primeiroNome, segundoNome, apelido, email, senha, dataNascimento, cidade, estado, foto, tipo);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean verificaUsuarioAdmin(String email) {
        try {
            UsuarioDaoIF dao = new UsuarioDao();
            List<Usuario> lista = dao.buscaUsuarios();
            for (Usuario it : lista) {
                if (it.getEmail().equalsIgnoreCase(email)) {
                    return it.isTipo();
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    
    
    public static boolean verificaUsername(String email, String apelido) {
        try {
            UsuarioDaoIF dao = new UsuarioDao();
            List<Usuario> lista = dao.buscaUsuarios();
            if (lista != null) {
                for (Usuario it : lista) {
                    if (it.getEmail().equals(email) || it.getApelido().equals(apelido)) {
                        return false;
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public static boolean verificaApelido(String apelido) {
        int cont = 0;
        try {
            UsuarioDaoIF dao = new UsuarioDao();
            List<Usuario> lista = dao.buscaUsuarios();
            if (lista != null) {
                for (Usuario it : lista) {
                    if (it.getApelido().equals(apelido)) {
                        cont += 1;
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return cont == 1; 
    }
    /*
    
     */


    public static boolean validarCadastroExclusao(String username, String senha) {
        try {
            UsuarioDaoIF dao = new UsuarioDao();
            List<Usuario> list = dao.buscaUsuarios();
            if (list != null) {
                for (Usuario it : list) {
                    if (it.getEmail().equals(username) || it.getApelido().equals(username)) {
                        return it.getPassword().equals(senha);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
