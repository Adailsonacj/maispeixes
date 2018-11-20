package com.peixes.br.maispeixes.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Biometria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_biometria")
    private int id;
    private Date data;
    private int nPeixesViveiro;
    private int nPeixesAmostra;
    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    @NotNull
    private Pessoa id_pessoa;
    @ManyToOne
    @JoinColumn(name = "id_tanque")
    @NotNull
    private Viveiro id_tanque;

    public Biometria() {

    }

    public Biometria(Date data, int nPeixesViveiro, int nPeixesAmostra, @NotNull Pessoa id_pessoa, @NotNull Viveiro id_tanque) {
        this.data = data;
        this.nPeixesViveiro = nPeixesViveiro;
        this.nPeixesAmostra = nPeixesAmostra;
        this.id_pessoa = id_pessoa;
        this.id_tanque = id_tanque;
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

    public Pessoa getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Pessoa id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public Viveiro getId_tanque() {
        return id_tanque;
    }

    public void setId_tanque(Viveiro id_tanque) {
        this.id_tanque = id_tanque;
    }
}
