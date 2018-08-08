package br.com.ufabc.pizzaplanet.model.entity;

import javax.persistence.*;

@Entity
@Table(name="login")
public class Login {

    @Id
    private String CPF;

    @Column(name = "senha", nullable = false)
    private String senha;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
        this.CPF = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String Senha) {
        this.senha = Senha;
    }
}
