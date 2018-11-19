package com.peixes.br.maispeixes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Biometria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date data;
    private int nPeixesViveiro;
    private int nPeixesAmostra;
    private float pesoMedio;
    private float tamanhoMedio;
    private int idPessoa;
    private int idPeixe;

    public Biometria(Date data, int nPeixesViveiro, int nPeixesAmostra, float pesoMedio, float tamanhoMedio, int idPessoa, int idPeixe) {
        this.data = data;
        this.nPeixesViveiro = nPeixesViveiro;
        this.nPeixesAmostra = nPeixesAmostra;
        this.pesoMedio = pesoMedio;
        this.tamanhoMedio = tamanhoMedio;
        this.idPessoa = idPessoa;
        this.idPeixe = idPeixe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getnPeixesViveiro() {
        return nPeixesViveiro;
    }

    public void setnPeixesViveiro(int nPeixesViveiro) {
        this.nPeixesViveiro = nPeixesViveiro;
    }

    public int getnPeixesAmostra() {
        return nPeixesAmostra;
    }

    public void setnPeixesAmostra(int nPeixesAmostra) {
        this.nPeixesAmostra = nPeixesAmostra;
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

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdPeixe() {
        return idPeixe;
    }

    public void setIdPeixe(int idPeixe) {
        this.idPeixe = idPeixe;
    }
}
