package br.com.ufabc.pizzaplanet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import br.com.ufabc.pizzaplanet.model.entity.Login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.com.ufabc.pizzaplanet.model.dao.LoginDao;

import javax.persistence.*;


@Controller
public class NavegacaoController {

    @RequestMapping(value = "/index")
    public String main() {
        return "index";
    }

    @RequestMapping(value = "/cadastro")
    public String contact() {
        return "cadastro";
    }

    @RequestMapping(value = "/cart")
    public String cart() {
        return "cart";
    }

    @RequestMapping(value = "/checkout")
    public String checkout() {
        return "checkout";
    }

    @RequestMapping(value = "/product")
    public String product() {
        return "product";
    }

    @RequestMapping(value = "/cardapio")
    public String cardapio() {
        return "cardapio";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/cadastro_produto")
    public String productRegistration(){
        return "cadastro_produto";
    }
}
