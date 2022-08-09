/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.charlystone.Interface;

import com.portfolio.charlystone.Entity.Persona;
import java.util.List;


/**
 *
 * @author CharlyStone
 */
public interface IPersonaService {
    //Traer una lista de persona
    
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    
    public void savePersona(Persona persona);
    
    
    //eliminar una poersona por id
    
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
    
}
