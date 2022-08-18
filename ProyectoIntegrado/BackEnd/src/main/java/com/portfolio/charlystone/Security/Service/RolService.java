/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.charlystone.Security.Service;

import com.portfolio.charlystone.Security.Entity.Rol;
import com.portfolio.charlystone.Security.Enums.RolNombre;
import com.portfolio.charlystone.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author CharlyStone
 */
@Service
@Transactional
public class RolService {

    @Autowired
    iRolRepository iroRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return iroRepository.findByRolNombre(rolNombre);

    }
    
    public void save(Rol rol){
        iroRepository.save(rol);
    }

}
