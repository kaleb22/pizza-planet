package br.com.ufabc.pizzaplanet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import br.com.ufabc.pizzaplanet.model.entity.Login;
import br.com.ufabc.pizzaplanet.model.entity.Cliente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.com.ufabc.pizzaplanet.model.dao.LoginDao;
import br.com.ufabc.pizzaplanet.model.dao.UserDao;
import java.util.Base64;

@Controller
public class LoginController {

    @Autowired
    LoginDao loginDao;

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
                                     @RequestParam String cpf, @RequestParam String senha) {
        ModelAndView mav = null;

        try {
            // Convertendo senha para base64
            String senha64 = Base64.getEncoder().encodeToString(senha.getBytes());

            // Verifico se login é válido
            Login userLogin = loginDao.findbyCpfAndPassword(cpf, senha64.toString());

            // Busco info do usuário
            Cliente userInfo = userDao.findbyCpf(userLogin.getCPF());

            mav = new ModelAndView("index");
            mav.addObject("welcome_username", "Olá, " + userInfo.getNome());

        } catch (Exception e) {
            mav = new ModelAndView("login");
            mav.addObject("login_failed", "Usuário e/ou senha não encontrados!");
        }
        return mav;
    }

}
