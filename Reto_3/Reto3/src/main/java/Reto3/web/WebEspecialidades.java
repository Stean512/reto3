/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.web;

import Reto3.modelo.Especialidades;
import Reto3.servicios.ServiciosEspecialidades;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author diego
 */
@RestController
@RequestMapping("/api/Specialty")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class WebEspecialidades {

    @Autowired
    private ServiciosEspecialidades servicios;

    @GetMapping("/all")
    public List<Especialidades> getEspecialidades() {
        return servicios.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Especialidades> getEspecialidades(@PathVariable("id") int idEspecialidades) {
        return servicios.getEspecialidades(idEspecialidades);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Especialidades save(@RequestBody Especialidades especialidades) {
        return servicios.save(especialidades);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Especialidades update(@RequestBody Especialidades especialidades) {
        return servicios.update(especialidades);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int especialidadesId) {
        return servicios.deleteEspecialidades(especialidadesId);
    }
}
