/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.Spring.Service;

import java.util.List;
import pe.edu.upeu.Spring.entity.Carrera;

/**
 *
 * @author HP
 */
public interface CarreraService {
    
    public List<Carrera> findAll();
    public Carrera findById(Long id);
    public Carrera save (Carrera carrera);
    public void delete(Carrera carrera);
    public void deleteById(Long id);
    
}
