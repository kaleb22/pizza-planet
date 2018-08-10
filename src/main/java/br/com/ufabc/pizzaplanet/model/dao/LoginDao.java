package br.com.ufabc.pizzaplanet.model.dao;

import br.com.ufabc.pizzaplanet.model.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.*;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface LoginDao extends JpaRepository<Login,String> {
    @Query("SELECT l FROM Login l WHERE l.cpf = ?1 AND l.senha = ?2")
    Login findUserLogin(String cpf, String senha);
}
