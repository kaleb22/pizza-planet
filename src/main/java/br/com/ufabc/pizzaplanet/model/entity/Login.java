package br.com.ufabc.pizzaplanet.model.entity;

import javax.persistence.*;

@Entity
@Table(name="login")
public class Login {

    @Id
    private String cpf;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "role", nullable = false)
    private int role;

    public String getCPF() {
        return cpf;
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String Senha) {
        this.senha = Senha;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public int getRole() {
        return role;
    }
    public void setRole(int role) {
        this.role = role;
    }
}
