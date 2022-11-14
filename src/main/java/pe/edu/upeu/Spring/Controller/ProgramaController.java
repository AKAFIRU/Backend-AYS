/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Spring.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.Spring.Service.ProgramaService;
import pe.edu.upeu.Spring.entity.Programa;

/**
 *
 * @author HP
 */
@CrossOrigin(origins = ("http://localhost:4200/"))
@RestController
@Api(value = "Microservicio de Gestion de persona", description = "Microservicio de Gestion de persona")
@RequestMapping("/programa")
public class ProgramaController {

    @Autowired
    private ProgramaService programaService;


    @ApiOperation(value = "Lista de taller")
    @GetMapping()
    public ResponseEntity<?> findAll() {
        HashMap<String, Object> result = new HashMap<>();
result.put("success", true);
result.put("message", "Lista de programas");
result.put("data", programaService.findAll());


        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ApiOperation(value = "Obtienes datos de taller")
    @GetMapping("/{id}")
    public ResponseEntity<Programa> findById(@PathVariable Long id) {
        Programa programa = programaService.findById(id);
        return ResponseEntity.ok(programa);
    }

    @ApiOperation(value = "Elimina un taller")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        programaService.deleteById(id);
    }

    @ApiOperation(value = "Crea un taller")
    @PostMapping("/save")
    public Programa save(@RequestBody Programa programa) {
        return programaService.save(programa);
    }

    @ApiOperation(value = "Modifica una persona")
    @PutMapping("/update")
    public Programa update(@RequestBody Programa programa) {
        return programaService.save(programa);
    }
}
