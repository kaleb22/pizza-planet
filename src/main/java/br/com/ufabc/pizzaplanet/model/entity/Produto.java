package br.com.ufabc.pizzaplanet.model.entity;

import javax.persistence.*;

@Entity
@Table(name="produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // means that the ID will be generated automatically
    private int id;

    @Column(name="tamanho", nullable=false)
    private String tamanho;

    @Column(name="descricao", nullable=false)
    private String descricao;

    @Column(name="valor", nullable=false)
    private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
