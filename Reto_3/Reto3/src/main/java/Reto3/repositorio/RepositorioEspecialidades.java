/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.repositorio;

import Reto3.interfaces.InterfaceEspecialidades;
import Reto3.modelo.Especialidades;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author diego
 */
@Repository
public class RepositorioEspecialidades {

    @Autowired
    private InterfaceEspecialidades crud2;

    public List<Especialidades> getAll() {
        return (List<Especialidades>) crud2.findAll();
    }

    public Optional<Especialidades> getEspecialidades(int id) {
        return crud2.findById(id);
    }

    public Especialidades save(Especialidades especialidades) {
        return crud2.save(especialidades);
    }

    public void delete(Especialidades especialidades) {
        crud2.delete(especialidades);
    }
}
