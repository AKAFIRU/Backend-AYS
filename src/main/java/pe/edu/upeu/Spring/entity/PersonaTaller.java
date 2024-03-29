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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HP
 */
@Data
@Entity
@Table(name = "persona_taller")
public class PersonaTaller implements Serializable {

   
    @Id
    @Column(name = "peta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long peId;
    
    @Column (name = "pe_estado_asistencia")
    private int peEstadoAsistencia;
    
    @ManyToOne
    @JoinColumn(name = "pe_id")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name = "ta_id")
    private Taller taller;
    
    
}
