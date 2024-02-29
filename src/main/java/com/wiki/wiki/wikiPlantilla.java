package com.wiki.wiki;

import java.util.ArrayList;

import org.hibernate.mapping.Collection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/plantilla")


public class wikiPlantilla {
    @GetMapping("/newFromulario")
    public String  laListaPipol(Model model) {
        Collection<String> wiki = new ArrayList<String>();
        model.addAttribute("Wiki", wiki);
        return "newFromulario";
    }
    

}
