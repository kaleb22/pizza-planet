package br.com.ufabc.pizzaplanet.model.entity;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    private String cpf;
    private String nome;
    private String telefone;
    private String cep;
    private int numero_endereco;
    private String endereco;
    private String bairro;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero_endereco() {
        return numero_endereco;
    }

    public void setNumero_endereco(int numero_endereco) {
        this.numero_endereco = numero_endereco;
    }
}
