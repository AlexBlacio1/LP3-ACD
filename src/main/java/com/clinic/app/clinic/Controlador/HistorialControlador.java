package com.clinic.app.clinic.Controlador;

import com.clinic.app.clinic.entidad.Historial;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HistorialControlador {

    @GetMapping("/historialmedico")
    public String formularioHistorial(Model model) {
        model.addAttribute("historial", new Historial());
        return "/Historial/formulario";
    }

    @PostMapping("/registrar")
    public String registroHistorial(@Valid @ModelAttribute Historial historial, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "/Historial/registro-fallido";
        }else{
        return "/Historial/registro-exitoso";
    }}
}
