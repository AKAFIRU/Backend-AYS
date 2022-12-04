/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.Spring.Service;

import java.util.List;
import pe.edu.upeu.Spring.entity.Facultad;

/**
 *
 * @author HP
 */
public interface FacultadService {
    
    public List<Facultad> findAll();
    public Facultad findById(Long id);
    public Facultad save (Facultad facultad);
    public void delete(Facultad facultad);
    public void deleteById(Long id);
    
}
