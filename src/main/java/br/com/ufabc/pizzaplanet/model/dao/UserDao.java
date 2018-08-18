package br.com.ufabc.pizzaplanet.model.dao;

import br.com.ufabc.pizzaplanet.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<Cliente, String> {
    @Query("select c from Cliente c where c.cpf = :cpf")
    public Cliente findbyCpf(@Param("cpf") String cpf);
}
