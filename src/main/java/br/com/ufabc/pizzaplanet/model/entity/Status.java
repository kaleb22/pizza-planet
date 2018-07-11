package br.com.ufabc.pizzaplanet.model.entity;

import javax.persistence.*;

@Entity
@Table(name="status")
public class Status {

    @Id
    private int id_status;

    @Column(name="descricao", nullable=false)
    private String descricao;

    public int getId_pedido() {
        return id_status;
    }

    public void setId_pedido(int id_status) {
        this.id_status = id_status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
