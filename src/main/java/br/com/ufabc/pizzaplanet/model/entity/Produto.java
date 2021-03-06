package br.com.ufabc.pizzaplanet.model.entity;

import javax.persistence.*;

@Entity
@Table(name="produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // means that the ID will be generated automatically
    private int id;

    @Column(name="nome", nullable=false)
    private String nome;

    @Column(name="descricao", nullable=false)
    private String descricao;

    @Column(name="valor", nullable=false)
    private double valor;

    @Column(name="imagem", nullable=true)
    private byte[] imagem;

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String tamanho) {
        this.nome = tamanho;
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
