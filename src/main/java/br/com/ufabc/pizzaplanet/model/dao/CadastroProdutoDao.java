package br.com.ufabc.pizzaplanet.model.dao;

import br.com.ufabc.pizzaplanet.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroProdutoDao extends JpaRepository<Produto, Double> {
}
