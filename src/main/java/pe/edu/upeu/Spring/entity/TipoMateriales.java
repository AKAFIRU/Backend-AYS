/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HP
 */
@Entity
@Data
@Table(name = "tipo_materiales")
public class TipoMateriales {
    @Id
    @Column(name = "tm_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tmId;
    
    @Column(name = "tm_name")
    private String tmName;
    
    @Column(name = "tm_desc")
    private String tmDesc;
    
}
