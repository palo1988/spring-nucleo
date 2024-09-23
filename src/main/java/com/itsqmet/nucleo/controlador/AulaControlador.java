package com.itsqmet.nucleo.controlador;

import com.itsqmet.nucleo.modelo.Aula;
import com.itsqmet.nucleo.servicio.IAulaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/aula")
public class AulaControlador {

    @Autowired
    private IAulaServicio aulaServicio;

    @GetMapping("/list")
    public String listarAulas(Model model) {
        List<Aula> aulas = aulaServicio.listarAulas();
        model.addAttribute("aulas", aulas);
        return "aula/aula-list";
    }

    @GetMapping("/create")
    public String mostrarFormularioCreacion(Model model) {
        model.addAttribute("aula", new Aula());
        return "aula/aula-create";
    }

    @PostMapping("/save")
    public String guardarAula(@ModelAttribute Aula aula) {
        aulaServicio.insertarAula(aula);
        return "redirect:/aula/list";
    }

    @GetMapping("/edit/{id}")
    public String mostrarFormularioEdicion(@PathVariable("id") Integer id, Model model) {
        Aula aula = aulaServicio.obtenerAulaPorId(id);
        model.addAttribute("aula", aula);
        return "aula/aula-edit";
    }

    @PostMapping("/update/{id}")
    public String actualizarAula(@PathVariable("id") Integer id, @ModelAttribute Aula aula) {
        aula.setIdAula(id);
        aulaServicio.actualizarAula(aula);
        return "redirect:/aula/list";
    }

    @GetMapping("/delete/{id}")
    public String eliminarAula(@PathVariable("id") Integer id) {
        aulaServicio.eliminarAula(id);
        return "redirect:/aula/list";
    }
}
