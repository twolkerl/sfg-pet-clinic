package com.twl.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /*
    Quando informado qualquer um dos parâmetros dentro do RequestMapping, será redirecionado para o template do index
     */
    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {

        return "index";
    }
}
