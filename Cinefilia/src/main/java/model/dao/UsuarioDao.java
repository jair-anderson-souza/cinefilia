    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.values.Usuario;
import model.conexao.Conexao;
import model.interfacesdaoifs.UsuarioDaoIF;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.exceptions.DaoException;

/**
 *
 * @author Anderson Souza
 */
public class UsuarioDao implements UsuarioDaoIF {

    private Conexao conexao;

    public UsuarioDao() {
        conexao = new Conexao();
    }

    
    @Override
    public boolean add(Usuario usuario) throws SQLException, ClassNotFoundException, DaoException {
        
            Connection connection = conexao.open();
            String sql = "insert into usuario(primeironome, segundonome, apelido, email, senha, datanascimento, cidade, estado, foto, tipo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement prepared = connection.prepareStatement(sql);
            prepared.setString(1, usuario.getPrimeiroNome());
            prepared.setString(2, usuario.getSegundoNome());
            prepared.setString(3, usuario.getApelido());
            prepared.setString(4, usuario.getEmail());
            prepared.setString(5, usuario.getPassword());
            prepared.setString(6, usuario.getDataDeNascimento());
            prepared.setString(7, usuario.getCidade());
            prepared.setString(8, usuario.getEstado());
            prepared.setString(9, usuario.getFoto());
            prepared.setBoolean(10, usuario.isTipo());
            return prepared.executeUpdate() > 0;
    }
    
    @Override
    public Usuario buscaUsuarioPorEmail(String email) throws SQLException, ClassNotFoundException {
        Connection connection = conexao.open();
        String sql = "select * from usuario where email = ?;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setString(1, email);
        ResultSet rs = prepared.executeQuery();
        Usuario usuario = new Usuario();
        rs.next();
        usuario.setPrimeiroNome(rs.getString("primeironome"));
        usuario.setSegundoNome(rs.getString("segundonome"));
        usuario.setApelido(rs.getString("apelido"));
        usuario.setEmail(rs.getString("email"));
        usuario.setPassword(rs.getString("senha"));
        usuario.setDataDeNascimento(rs.getString("datanascimento"));
        usuario.setCidade(rs.getString("cidade"));
        usuario.setEstado(rs.getString("estado"));
        usuario.setFoto(rs.getString("foto"));
        usuario.setTipo(rs.getBoolean("tipo"));
        return usuario; 
    }
    
    @Override
    public List<Usuario> buscaTodosOsUsuarioPorEmail(String email) throws SQLException, ClassNotFoundException {
        Connection connection = conexao.open();
        String sql = "select * from usuario where email <> ?;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setString(1, email);
        ResultSet rs = prepared.executeQuery();
        List<Usuario> lista = new ArrayList();
        while (rs.next()) {
            Usuario u = new Usuario();
            u.setPrimeiroNome(rs.getString("primeironome"));
            u.setSegundoNome(rs.getString("segundonome"));
            u.setApelido(rs.getString("apelido"));
            u.setEmail(rs.getString("email"));
            u.setPassword(rs.getString("senha"));
            u.setDataDeNascimento(rs.getString("datanascimento"));
            u.setCidade(rs.getString("cidade"));
            u.setEstado(rs.getString("estado"));
            u.setFoto(rs.getString("foto"));
            u.setTipo(rs.getBoolean("tipo"));

            lista.add(u);
        }
        return lista;  
    }

    @Override
    public List<Usuario> buscaUsuarios() throws SQLException, ClassNotFoundException {
        Connection connection = conexao.open();
        String sql = "select * from usuario;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        ResultSet rs = prepared.executeQuery();
        List<Usuario> lista = new ArrayList<>();

        while (rs.next()) {
            Usuario u = new Usuario();
            u.setPrimeiroNome(rs.getString("primeironome"));
            u.setSegundoNome(rs.getString("segundonome"));
            u.setApelido(rs.getString("apelido"));
            u.setEmail(rs.getString("email"));
            u.setPassword(rs.getString("senha"));
            u.setDataDeNascimento(rs.getString("datanascimento"));
            u.setCidade(rs.getString("cidade"));
            u.setEstado(rs.getString("estado"));
            u.setFoto(rs.getString("foto"));
            u.setTipo(rs.getBoolean("tipo"));

            lista.add(u);
        }
        return lista;
    }

    @Override
    public boolean update(Usuario usuario, String email) throws SQLException, ClassNotFoundException {
        Connection connection = conexao.open();
        String sql = "update usuario "
                + "set primeiroNome = ?, segundoNome = ?, apelido = ?, email = ?, senha = ?, dataNascimento = ?, cidade = ?, estado = ?, foto = ? "
                + "where email = ?;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setString(1, usuario.getPrimeiroNome());
        prepared.setString(2, usuario.getSegundoNome());
        prepared.setString(3, usuario.getApelido());
        prepared.setString(4, usuario.getEmail());
        prepared.setString(5, usuario.getPassword());
        prepared.setString(6, usuario.getDataDeNascimento());
        prepared.setString(7, usuario.getCidade());
        prepared.setString(8, usuario.getCidade());
        prepared.setString(9, usuario.getEstado());
        prepared.setString(10, email);
        return prepared.executeUpdate() > 0;
    }

    @Override
    public boolean delete(String username) throws SQLException, ClassNotFoundException {
        Connection connection = conexao.open();
        String sql = "delete from usuario where email = ? || apelido=?;";
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setString(1, username);
        prepared.setString(2, username);
        return prepared.executeUpdate()> 0;
    }

}
