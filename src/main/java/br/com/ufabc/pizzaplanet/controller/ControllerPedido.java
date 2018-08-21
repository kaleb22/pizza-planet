package br.com.ufabc.pizzaplanet.controller;

import br.com.ufabc.pizzaplanet.model.dao.CadastroItemDao;
import br.com.ufabc.pizzaplanet.model.dao.CadastroProdutoDao;
import br.com.ufabc.pizzaplanet.model.entity.Item;
import br.com.ufabc.pizzaplanet.model.entity.Login;
import br.com.ufabc.pizzaplanet.model.entity.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerPedido {

    @Autowired
    private CadastroItemDao itemDao;
    private ModelAndView mav;

    @RequestMapping(value = "/cadastraPedido", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    ModelAndView cadastraPedido(@RequestBody Pizza pizzaJson) {
        Item item = new Item();
        item.setNome(nome);
        item.setValor(valor);
        item.setQuantidade(qtde);

        itemDao.save(item);
        mav = new ModelAndView("");
        return mav;
    }
}
