package com.tiendaropa.tienda.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "Prueba")
    public String prueba() {
        return "Prueba";
    }

}
