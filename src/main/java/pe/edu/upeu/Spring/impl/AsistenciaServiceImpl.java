/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Spring.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.Spring.Service.AsistenciaService;
import pe.edu.upeu.Spring.entity.Asistencia;
import pe.edu.upeu.Spring.repository.AsistenciaRepository;

@Service
public class AsistenciaServiceImpl implements AsistenciaService{

    @Autowired
    private AsistenciaRepository asistenciaRepository;
    
    @Transactional(readOnly = true)
    @Override
    public List<Asistencia> findAll() {
        return (List<Asistencia>) asistenciaRepository.findAll();
    }

    @Override
    public Asistencia findById(Long id) {
        return asistenciaRepository.findById(id).orElse(null);
    }

    @Override
    public Asistencia save(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public void delete(Asistencia asistencia) {
        asistenciaRepository.delete(asistencia);
    }

    @Override
    public void deleteById(Long id) {
        asistenciaRepository.deleteById(id);
    }
    
}
