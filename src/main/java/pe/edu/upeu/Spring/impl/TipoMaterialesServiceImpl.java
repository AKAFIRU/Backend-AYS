/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Spring.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.Spring.Service.TipoMaterialesService;
import pe.edu.upeu.Spring.entity.TipoMateriales;
import pe.edu.upeu.Spring.repository.TipoMaterialesRepository;

/**
 *
 * @author HP
 */
@Service
public class TipoMaterialesServiceImpl implements TipoMaterialesService{

@Autowired
    TipoMaterialesRepository tipoMaterialesRepository;
    
    @Override
    public List<TipoMateriales> findAll() {
        return (List<TipoMateriales>) tipoMaterialesRepository.findAll();
    }

    @Override
    public TipoMateriales findById(Long id) {
        return tipoMaterialesRepository.findById(id).orElse(null);
    }

    @Override
    public TipoMateriales save(TipoMateriales tipoMateriales) {
        return tipoMaterialesRepository.save(tipoMateriales);
    }

    @Override
    public void delete(TipoMateriales tipoMateriales) {
        tipoMaterialesRepository.delete(tipoMateriales);
    }

    @Override
    public void deleteById(Long id) {
        tipoMaterialesRepository.deleteById(id);
    }
}
