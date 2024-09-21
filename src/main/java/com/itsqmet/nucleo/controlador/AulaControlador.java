package com.itsqmet.nucleo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AulaControlador {
    @GetMapping("/aula")
    public String paginaAula(){
        return "/aula/listarAula";
    }
}
