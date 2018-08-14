package br.com.ufabc.pizzaplanet.model.dao;

import br.com.ufabc.pizzaplanet.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroDao extends JpaRepository<Cliente, String> {
}
