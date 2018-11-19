package com.peixes.br.maispeixes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tanque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float capacidade;
    private float tamanho;
    private int id_tipo_producao;
    private int id_pessoa;

    public Tanque(){

    }

    public Tanque(float capacidade, float tamanho, int id_tipo_producao, int id_pessoa) {
        this.capacidade = capacidade;
        this.tamanho = tamanho;
        this.id_tipo_producao = id_tipo_producao;
        this.id_pessoa = id_pessoa;
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

    public int getId_tipo_producao() {
        return id_tipo_producao;
    }

    public void setId_tipo_producao(int id_tipo_producao) {
        this.id_tipo_producao = id_tipo_producao;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
}
