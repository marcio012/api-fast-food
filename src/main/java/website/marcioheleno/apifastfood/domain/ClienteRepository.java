package website.marcioheleno.apifastfood.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * The interface Cliente repository.
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    List<Cliente> findByIdOrderById(String nome);

}
