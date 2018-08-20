package br.com.ufabc.pizzaplanet.controller;

import br.com.ufabc.pizzaplanet.model.entity.Pizza;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerPedido {

    @RequestMapping(value = "/cadastraPedido", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    ModelAndView cadastraPedido(@RequestBody Pizza pizzaJson) {
        ModelAndView mav = null;
        System.out.println(pizzaJson.getNome());
        return mav;
    }
}
