
package pe.edu.upeu.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.Spring.entity.TipoPersona;

@Repository
public interface TipoPersonaRepository extends CrudRepository<TipoPersona, Long> {
}
