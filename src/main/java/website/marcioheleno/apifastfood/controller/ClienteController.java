package website.marcioheleno.apifastfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import website.marcioheleno.apifastfood.domain.Cliente;
import website.marcioheleno.apifastfood.domain.ClienteRepository;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @RequestMapping(value = "/clientes")
    public Iterable<Cliente> getCliente() {
        return clienteRepository.findAll();
    }


}
