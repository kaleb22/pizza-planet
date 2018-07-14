package br.com.ufabc.pizzaplanet.model.entity;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    private String cpf;

    @Column(name="nome", nullable=false)
    private String nome;
    @Column(name="telefone", nullable=false)
    private String telefone;
    @Column(name="email", nullable=false)
    private String email;
    @Column(name="cep", nullable=false)
    private String cep;
    @Column(name="numero_endereco", nullable=false)
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
