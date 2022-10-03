/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.Spring.Service;

import java.util.List;
import pe.edu.upeu.Spring.entity.Asistencia;

public interface AsistenciaService {
    
    public List<Asistencia> findAll();

    public Asistencia findById(Long id);

    public Asistencia save(Asistencia asistencia);

    public void delete(Asistencia asistencia);

    public void deleteById(Long id);
    
}
