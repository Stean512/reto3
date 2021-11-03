/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3.interfaces;

import Reto3.modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author diego
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
