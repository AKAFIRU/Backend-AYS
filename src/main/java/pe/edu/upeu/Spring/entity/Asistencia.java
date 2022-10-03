/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Spring.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "asistencia")
public class Asistencia implements Serializable{
    
    @Id
    @Column(name = "asis_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long asisId;
    
    @Column(name="asis_nombre")
    private String asisName;
    
    @Column(name ="asis_Apellidos")
    private String asisApellidos;
    
    @Column(name="asisCodigo")
    private String asisCodigo;
    
    @Column(name = "asisDni")
    private String AsisDNI;
    
}

