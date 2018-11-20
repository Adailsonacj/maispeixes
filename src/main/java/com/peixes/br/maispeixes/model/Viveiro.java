package com.peixes.br.maispeixes.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Viveiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viveiro")
    private int id;
    private float capacidade;
    private float tamanho;
    @ManyToOne
    @JoinColumn(name = "id_tipo_viveiro")
    @NotNull
    private TipoViveiro id_tipo_viveiro;
    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    @NotNull
    private Pessoa id_pessoa;

    public Viveiro() {

    }

    public Viveiro(float capacidade, float tamanho, @NotNull TipoViveiro id_tipo_viveiro, @NotNull Pessoa id_pessoa) {
        this.capacidade = capacidade;
        this.tamanho = tamanho;
        this.id_tipo_viveiro = id_tipo_viveiro;
        this.id_pessoa = id_pessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public TipoViveiro getId_tipo_viveiro() {
        return id_tipo_viveiro;
    }

    public void setId_tipo_viveiro(TipoViveiro id_tipo_viveiro) {
        this.id_tipo_viveiro = id_tipo_viveiro;
    }

    public Pessoa getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Pessoa id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
}
