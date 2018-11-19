package com.peixes.br.maispeixes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Peixe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_especie;
    private int id_viveiro;

    public Peixe(int id_especie, int id_viveiro) {
        this.id_especie = id_especie;
        this.id_viveiro = id_viveiro;
    }

    public int getId_especie() {
        return id_especie;
    }

    public void setId_especie(int id_especie) {
        this.id_especie = id_especie;
    }

    public int getId_viveiro() {
        return id_viveiro;
    }

    public void setId_viveiro(int id_viveiro) {
        this.id_viveiro = id_viveiro;
    }
}
