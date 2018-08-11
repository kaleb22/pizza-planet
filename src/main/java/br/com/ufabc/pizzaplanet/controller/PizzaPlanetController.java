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
public class PizzaPlanetController {

    @Autowired
    LoginDao loginDao;

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

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
                                     @RequestParam String cpf, @RequestParam String senha) {
        ModelAndView mav = null;

   //     Login userLogin = loginDao.findUserLogin(cpf, senha);

        try{
            Login userLogin = loginDao.getOne(cpf);

            System.out.println(userLogin.getCPF());
            System.out.println(userLogin.getRole());
            System.out.println(userLogin.getUsername());

            mav = new ModelAndView("index");
            mav.addObject("welcome_username", "Olá, " + userLogin.getUsername());

        } catch (Exception e) {
            mav = new ModelAndView("login");
            mav.addObject("login_failed", "Usuário e/ou senha não encontrados!");
        }
        return mav;
    }
}
