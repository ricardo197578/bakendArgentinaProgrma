package com.porfolio.richard.util;                                       
import com.porfolio.richard.Entity.Rol;
import com.porfolio.richard.enums.RolNombre;
import com.porfolio.richard.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * MUY IMPORTANTE: ESTA CLASE SÓLO SE EJECUTARÁ UNA VEZ PARA CREAR LOS
 ROLES.
 * UNA VEZ CREADOS SE DEBERÁ ELIMINAR O BIEN COMENTAR EL CÓDIGO
 *
 */

@Component
public class CreateRoles implements CommandLineRunner {               
    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
       /* Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);                                            rolService.save(rolUser);*/
         
    }
}
