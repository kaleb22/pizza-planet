package br.com.ufabc.pizzaplanet.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Pedido {

    @Id
    private int id;
    private String cpf;
    private Date data;
    private int id_pagamento;
    private int id_produto;
    private double preco;
    


}
