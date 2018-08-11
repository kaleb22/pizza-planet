package br.com.ufabc.pizzaplanet.controller;

import br.com.ufabc.pizzaplanet.model.dao.LoginDao;
import br.com.ufabc.pizzaplanet.model.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController {

    @Autowired
    LoginDao loginDao;

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
                                     @RequestParam String cpf, @RequestParam String senha) {
        ModelAndView mav = null;

        try {
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
