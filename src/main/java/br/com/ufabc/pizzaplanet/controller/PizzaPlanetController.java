package br.com.ufabc.pizzaplanet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PizzaPlanetController {

    @RequestMapping(value = "/index")
    public String main(){
        return "index";
    }
}
