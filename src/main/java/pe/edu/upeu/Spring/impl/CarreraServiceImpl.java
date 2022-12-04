/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Spring.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.Spring.Service.CarreraService;
import pe.edu.upeu.Spring.entity.Carrera;
import pe.edu.upeu.Spring.repository.CarreraRepository;

/**
 *
 * @author HP
 */
@Service
public class CarreraServiceImpl implements CarreraService{

    @Autowired
    CarreraRepository carreraRepository;
    
    @Override
    public List<Carrera> findAll() {
        return (List<Carrera>) carreraRepository.findAll();
    }

    @Override
    public Carrera findById(Long id) {
        return carreraRepository.findById(id).orElse(null);
    }

    @Override
    public Carrera save(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    @Override
    public void delete(Carrera carrera) {
        carreraRepository.delete(carrera);
    }

    @Override
    public void deleteById(Long id) {
        carreraRepository.deleteById(id);
    }
    
}