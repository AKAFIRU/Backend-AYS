/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.Spring.entity.TipoMateriales;

/**
 *
 * @author HP
 */
@Repository
public interface TipoMaterialesRepository extends CrudRepository<TipoMateriales, Long> {
    
}
