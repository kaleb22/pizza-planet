package br.com.ufabc.pizzaplanet.model.dao;

import br.com.ufabc.pizzaplanet.model.entity.Cliente;
import br.com.ufabc.pizzaplanet.model.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CadastroDao extends JpaRepository<Cliente, String> {
}
