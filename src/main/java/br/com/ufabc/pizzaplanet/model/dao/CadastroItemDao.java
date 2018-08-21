package br.com.ufabc.pizzaplanet.model.dao;

import br.com.ufabc.pizzaplanet.model.entity.Item;
import br.com.ufabc.pizzaplanet.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroItemDao extends JpaRepository<Item, Double> {
}
