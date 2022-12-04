/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Spring.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.Spring.Service.MaterialesService;
import pe.edu.upeu.Spring.entity.Materiales;
import pe.edu.upeu.Spring.repository.MaterialesRepository;



    @Service
public class MaterialesServiceImpl implements MaterialesService{
    
    @Autowired
    MaterialesRepository materialesRepository;

    @Override
    public List<Materiales> findAll() {
        return (List<Materiales>) materialesRepository.findAll();
    }

    @Override
    public Materiales findById(Long id) {
        return materialesRepository.findById(id).orElse(null);
    }

    @Override
    public Materiales save(Materiales materiales) {
        return materialesRepository.save(materiales);
    }

    @Override
    public void delete(Materiales materiales) {
        materialesRepository.delete(materiales);
    }

    @Override
    public void deleteById(Long id) {
        materialesRepository.deleteById(id);
    }
    
}

