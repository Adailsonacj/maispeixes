package com.peixes.br.maispeixes.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Peixe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_peixe")
    private int id;
    private float pesoMedio;
    private float tamanhoMedio;
    @ManyToOne
    @JoinColumn(name = "id_especie")
    @NotNull
    private Especie id_especie;
    @ManyToOne
    @JoinColumn(name = "id_biometria")
    @NotNull
    private Biometria id_viveiro;

    public Peixe() {

    }

    public Peixe(float pesoMedio, float tamanhoMedio, @NotNull Especie id_especie, @NotNull Biometria id_viveiro) {
        this.pesoMedio = pesoMedio;
        this.tamanhoMedio = tamanhoMedio;
        this.id_especie = id_especie;
        this.id_viveiro = id_viveiro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(float pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public float getTamanhoMedio() {
        return tamanhoMedio;
    }

    public void setTamanhoMedio(float tamanhoMedio) {
        this.tamanhoMedio = tamanhoMedio;
    }

    public Especie getId_especie() {
        return id_especie;
    }

    public void setId_especie(Especie id_especie) {
        this.id_especie = id_especie;
    }

    public Biometria getId_viveiro() {
        return id_viveiro;
    }

    public void setId_viveiro(Biometria id_viveiro) {
        this.id_viveiro = id_viveiro;
    }
}
