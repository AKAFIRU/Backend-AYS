
package pe.edu.upeu.Spring.Service;

import java.util.List;
import pe.edu.upeu.Spring.entity.TipoPersona;

public interface TipoPersonaService {

    public List<TipoPersona> findAll();

    public TipoPersona findById(Long id);

    public TipoPersona save(TipoPersona tipoPersona);

    public void delete(TipoPersona tipoPersona);

    public void deleteById(Long id);
}
