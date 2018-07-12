package br.com.ufabc.pizzaplanet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PizzaPlanetController {

    @RequestMapping(value = "/index")
    public String main(){
        return "index";
    }

    @RequestMapping(value = "/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping(value = "/cart")
    public String cart(){
        return "cart";
    }

    @RequestMapping(value = "/checkout")
    public String checkout(){
        return "checkout";
    }

    @RequestMapping(value = "/product")
    public String product(){
        return "product";
    }

    @RequestMapping(value = "/categories")
    public String categories(){
        return "categories";
    }
}
