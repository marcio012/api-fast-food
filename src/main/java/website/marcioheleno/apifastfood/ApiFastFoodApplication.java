package website.marcioheleno.apifastfood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import website.marcioheleno.apifastfood.domain.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ApiFastFoodApplication {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private ProdutoRepository produtoRepository;


    public static void main(String[] args) {
        SpringApplication.run(ApiFastFoodApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {


            // TODO: injet comandos sql para testes

            // Cliente
            Cliente cliente1 = new Cliente("Márcio", "Heleno", 18, "Eurico Medina, 1020", 'M');
            Cliente cliente2 = new Cliente("Vanessa", "Nessaa", 19, "Unifor bloco G", 'F');
            Cliente cliente3 = new Cliente("Ségio", "Legal", 25, "Unifor Bloco M4 - Blue Lab", 'M');
            clienteRepository.save(cliente1);
            clienteRepository.save(cliente2);
            clienteRepository.save(cliente3);

            // Produtos
            Produto produto1 = new Produto("Refri", "Refri Gelado", 2);
            Produto produto2 = new Produto("Pizza Grande", "Pizza Grande Mussarela", 50);
            Produto produto3 = new Produto("Pastel de Carne", "Delicioso Pastel de Carne", 25);
            produtoRepository.save(produto1);
            produtoRepository.save(produto2);
            produtoRepository.save(produto3);

            // Compras
            Compra compra1 = new Compra(1, 2.00, cliente1);
            Compra compra2 = new Compra(2, 50.00, cliente2);
            Compra compra3 = new Compra(1, 25.00, cliente3);

            compraRepository.save(compra1);
            compraRepository.save(compra2);
            compraRepository.save(compra3);




            compraRepository.save(new Compra(1, 2.00));



        };
    }
}
