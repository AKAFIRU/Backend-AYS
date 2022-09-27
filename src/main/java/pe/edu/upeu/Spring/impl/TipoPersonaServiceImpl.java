
package pe.edu.upeu.Spring.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.Spring.Service.TipoPersonaService;
import pe.edu.upeu.Spring.entity.TipoPersona;
import pe.edu.upeu.Spring.repository.TipoPersonaRepository;


    @Service
public class TipoPersonaServiceImpl implements TipoPersonaService {

    @Autowired
    private TipoPersonaRepository tipoPersonaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TipoPersona> findAll() {
        return (List<TipoPersona>) tipoPersonaRepository.findAll();
    }

    @Override
    public TipoPersona findById(Long id) {
        return tipoPersonaRepository.findById(id).orElse(null);
    }

    @Override
    public TipoPersona save(TipoPersona tipoPersona) {
        return tipoPersonaRepository.save(tipoPersona);
    }

    @Override
    public void delete(TipoPersona tipoPersona) {
        tipoPersonaRepository.delete(tipoPersona);
    }

    @Override
    public void deleteById(Long id) {
        tipoPersonaRepository.deleteById(id);
    }
}

