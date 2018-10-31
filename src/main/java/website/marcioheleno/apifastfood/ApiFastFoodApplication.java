package website.marcioheleno.apifastfood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import website.marcioheleno.apifastfood.domain.Cliente;
import website.marcioheleno.apifastfood.domain.ClienteRepository;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ApiFastFoodApplication {

    @Autowired
    private ClienteRepository clienteRepository;

    public static void main(String[] args) {
        SpringApplication.run(ApiFastFoodApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            // TODO: injet comandos sql para testes
            clienteRepository.save(new Cliente("Márcio", "Heleno", 18, "Eurico Medina, 1020", 'M'));
            clienteRepository.save(new Cliente("Vanessa", "Nessaa", 19, "Unifor bloco G", 'F'));
            clienteRepository.save(new Cliente("Ségio", "Legal", 25, "Unifor Bloco M4 - Blue Lab", 'M'));
        };
    }
}
