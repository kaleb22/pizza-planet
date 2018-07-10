package br.com.ufabc.pizzaplanet.model.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
public class Cliente {

    @Id
    private String cpf;

    private String nome;
    private String telefone;
    private String email;
    private String cep;
    private int numero_endereco;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
