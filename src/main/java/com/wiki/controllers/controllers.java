package com.wiki.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wiki.Modelo.modelo;

import ch.qos.logback.core.model.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
@RequestMapping("/controlres")
public class controllers {
    @Autowired
    private ApplicationRepository applicationRepository;

    /**
     * @return
     */
    @PostMapping("/formulario")
    public String imprimirDato(Model model @RequestParam String nombres){
        applicationRepository.save(new Wiki(id:null, nombres, apellidos:"Apellidos", correo:"Correo", semestre:"Semestre", descripcion:"Descripcion"));
        Iterable<Wiki> wiki = ApplicationRepository.finAll();

        midel.addAtribute(attributeName:"wiki",wiki);
        return "newFromulario";
    }
    
    

}
