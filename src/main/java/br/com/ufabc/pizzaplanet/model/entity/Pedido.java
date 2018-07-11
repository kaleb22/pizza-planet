package br.com.ufabc.pizzaplanet.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // means that the ID will be generated automatically
    private int id;

    @Column(name="cpf", nullable = false)
    private String cpf;

    @Column(name="data", nullable=false)
    private Date data;

    @Column(name="id_pagamento", nullable=false)
    private int id_pagamento;

    @Column(name="id_produto", nullable=false)
    private int id_produto;

    @Column(name="preco", nullable=false)
    private double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
