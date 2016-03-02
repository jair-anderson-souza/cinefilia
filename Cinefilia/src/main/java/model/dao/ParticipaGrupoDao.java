/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.conexao.Conexao;
import model.interfacesdaoifs.ParticipaGrupoDaoIF;
import model.values.ParticipantesGrupo;

/**
 *
 * @author Anderson Souza
 */
public class ParticipaGrupoDao extends ParticipaGrupoDaoIF {
    private Conexao conexao;

    public ParticipaGrupoDao() {
        conexao = new Conexao();
    }

    @Override
    public List buscaParticipantes() throws ClassNotFoundException, SQLException {
        String sql = "select * from participa_grupo;";
        Connection connection = conexao.open();
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<ParticipantesGrupo> lista = new ArrayList<>();
        
        while(rs.next()){
            int id_grupo = rs.getInt("id_grupo");
            String id_usuario = rs.getString("id_usuario");
            lista.add(new ParticipantesGrupo(id_grupo, id_usuario));
        }
        return lista;
    }

    public void addParticipantes(int id_grupo, String email) throws ClassNotFoundException, SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.open();
        String sql = "insert into participa_grupo(id_grupo, id_usuario) values(?, ?);"; 
        PreparedStatement prepared = connection.prepareStatement(sql);
        prepared.setInt(1, id_grupo);
        prepared.setString(2, email);
        prepared.execute();
    }
}