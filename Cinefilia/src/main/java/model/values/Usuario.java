/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.values;

/**
 *
 * @author Anderson Souza
 */
public class Usuario {
    private String primeiroNome;
    private String segundoNome;
    private String apelido;
    private String email;
    private String password;
    private String dataDeNascimento;
    private String cidade;
    private String estado;
    private String foto;
    private boolean tipo;

    public Usuario(String primeiroNome, String segundoNome, String apelido, String email, String password, String dataDeNascimento, String cidade, String estado, String foto) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.apelido = apelido;
        this.email = email;
        this.password = password;
        this.dataDeNascimento = dataDeNascimento;
        this.cidade = cidade;
        this.estado = estado;
        this.foto = foto;
        this.tipo = false;
    }

    public Usuario(String primeiroNome, String segundoNome, String apelido, String email, String password, String dataDeNascimento, String cidade, String estado, String foto, boolean tipo) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.apelido = apelido;
        this.email = email;
        this.password = password;
        this.dataDeNascimento = dataDeNascimento;
        this.cidade = cidade;
        this.estado = estado;
        this.foto = foto;
        this.tipo = tipo;
    }

    public Usuario() {
    
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getFoto() {
        return foto;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
}
