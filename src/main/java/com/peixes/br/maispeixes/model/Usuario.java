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
    @MapsId("id_pessoa")
    @OneToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa idPessoa;
    private int id_pessoa;

    public Usuario(){

    }

    public Usuario(String email, String senha, @NotNull int id_pessoa) {
        this.email = email;
        this.senha = senha;
        this.id_pessoa = id_pessoa;
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

    public Pessoa getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
}
