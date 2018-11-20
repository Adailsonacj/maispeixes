package com.peixes.br.maispeixes.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int id;
    private String email;
    private String senha;
    @JoinColumn(name = "id_pessoa")
    @NotNull
    private Pessoa idPessoa;

    public Usuario(){

    }

    public Usuario(String email, String senha, @NotNull Pessoa idPessoa) {
        this.email = email;
        this.senha = senha;
        this.idPessoa = idPessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa getId_pessoa() {
        return idPessoa;
    }

    public void setId_pessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }
}
