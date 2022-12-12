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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HP
 */
@Entity
@Data
@Table (name= "persona" )

public class Persona {


@Id
    @Column(name = "pers_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long peId;
    
    @Column(name = "pers_dni")
    private int peDNI;
    
    @Column(name = "pers_nombres")
    private String peNombres;
    
    @Column(name = "pers_apellido_p")
    private String peApellidoP;
    
    @Column(name = "pers_apellido_m")
    private String peApellidoM;
    
    @Column (name = "pers_cell")
    private int peCell;    
    
    @ManyToOne
    @JoinColumn(name = "tp_id")
    private TipoPersona tipoPersona;
    
    @ManyToOne
    @JoinColumn(name = "ca_id")
    private Carrera carrera;
    
}
