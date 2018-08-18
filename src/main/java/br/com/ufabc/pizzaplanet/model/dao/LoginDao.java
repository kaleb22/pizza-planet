package br.com.ufabc.pizzaplanet.model.dao;

import br.com.ufabc.pizzaplanet.model.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoginDao extends JpaRepository<Login,String> {
    @Query("select l from Login l where l.cpf = :cpf and l.senha = :senha")
    public Login findbyCpfAndPassword(@Param("cpf") String cpf, @Param("senha") String senha);
}
