/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.repositorio;

import Reto3.interfaces.InterfaceMensaje;
import Reto3.modelo.Mensaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author diego
 */
@Repository
public class RepositorioMensaje {

    @Autowired
    private InterfaceMensaje crud3;

    public List<Mensaje> getAll() {
        return (List<Mensaje>) crud3.findAll();
    }

    public Optional<Mensaje> getMessage(int id) {
        return crud3.findById(id);
    }

    public Mensaje save(Mensaje message) {
        return crud3.save(message);
    }

    public void delete(Mensaje mensaje) {
        crud3.delete(mensaje);
    }
}
