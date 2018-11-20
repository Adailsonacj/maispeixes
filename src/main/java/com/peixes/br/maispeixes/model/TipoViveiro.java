package com.peixes.br.maispeixes.model;

import javax.persistence.*;

@Entity
public class TipoViveiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_viveiro")
    private int id;
    private String nome;

    public TipoViveiro() {
    }

    public TipoViveiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
