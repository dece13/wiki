package com.wiki.wiki.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wiki.wiki.entity.Application;
import com.wiki.wiki.repository.ApplicationRepository;


@SuppressWarnings("unused")
@Controller
public class WikiController {

    private final ApplicationRepository applicationRepository;

    @Autowired
    public WikiController(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

   
    @GetMapping("/grupo13/home")
    public String home(){
         return "index.html";
     }
    
    @GetMapping("/grupo13/home/formulario")
    public String showFormulario() {
        return "formulario.html"; // Nombre de tu página de formulario
    }

    @PostMapping("/grupo13/home/formulario")
    public String processFormulario(@RequestParam("name") String name,
                                    @RequestParam("apellidos") String apellidos,
                                    @RequestParam("edad") int edad,
                                    @RequestParam("correo") String correo,
                                    @RequestParam("descripcion") String descripcion,
                                    @RequestParam("semestre") int semestre) {
        Application application = new Application();
        application.setName(name);
        application.setApellidos(apellidos);
        application.setEdad(edad);
        application.setCorreo(correo);
        application.setDescripcion(descripcion);
        application.setSemestre(semestre);
        application.setFecha(LocalDate.now());

        applicationRepository.save(application);

        return "redirect:/grupo13/home"; // Redirige de vuelta al formulario después de guardar los datos
    }
}
