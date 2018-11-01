package website.marcioheleno.apifastfood.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


/**
 * The interface Cliente repository.
 */
@RepositoryRestResource
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    List<Cliente> findByNome(@Param("nome") String nome);

    List<Cliente> findBySobrenome(@Param("sobrenome") String sobrenome);


}
