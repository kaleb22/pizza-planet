package br.com.ufabc.pizzaplanet.controller;

import br.com.ufabc.pizzaplanet.model.dao.CadastroDao;
import br.com.ufabc.pizzaplanet.model.dao.LoginDao;
import br.com.ufabc.pizzaplanet.model.entity.Cliente;
import br.com.ufabc.pizzaplanet.model.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Base64;

@Controller
public class CadastroController {

    @Autowired
    private CadastroDao cadastroDao;

    @Autowired
    private LoginDao loginDao;

    @RequestMapping(value = "/cadastrarCliente", method = RequestMethod.POST)
    public ModelAndView cadastrarCliente(@RequestParam String nome, String cpf, String senha, String cep, String endereco,
                                         String numero, String bairro, String telefone){

        Cliente cliente = new Cliente(cpf);
        cliente.setNome(nome);
        cliente.setCep(cep);
        cliente.setEndereco(endereco);
        cliente.setBairro(bairro);
        cliente.setNumero( Integer.parseInt(numero));
        cliente.setTelefone(telefone);

        // Convertendo senha para base64
        String senha64 = Base64.getEncoder().encodeToString(senha.getBytes());

        Login login = new Login();
        login.setCPF(cpf);
        login.setSenha(senha64);
        login.setRole(0);

        // salvando cliente
        cadastroDao.save(cliente);

        // salvando login
        loginDao.save(login);

        ModelAndView mav = new ModelAndView("login");

        return mav;
    }
}