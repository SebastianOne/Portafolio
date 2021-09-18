package com.rueda.main.controller;


import com.rueda.main.service.PacienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/paciente")
public class PacienteController {
    private PacienteService servicioPaciente = new PacienteService();

    // REDIRIGIRME A LA PANTALLA DE INICIO
    @GetMapping("/index")
    public String index(){
        return "/paciente/index";
    }

    //Cuenado estamos en la pantalla de incio, hay un href que me redirige /lista, en donde me listara todos los pacientes
    //los cuales estan jarcodeados, y no se hace ningun tipo de llamada a un a base de datos.
    @GetMapping("/lista")
    public ModelAndView readAll(){
        ModelAndView model = new ModelAndView();
        model.addObject("pacientes",servicioPaciente.readAll());
        model.setViewName("/paciente/listaPaciente");
        return model;
    }

    // en el getMApping esta readOne, porque en el form en action le colocamos readOne para que ese formulario fuera procesado por este metodo.
    // en el index hay un input que si un coloca un correo que existe en los pacientes que tenemos jarcodeados al momento de invocar
    //el metodo readOne de service me devolvera a ese paciente con sus datos.
    // y me va a redirigir a la vista paciente,
    //en el getMa
    @GetMapping("/readOne")
    public ModelAndView readOne(@RequestParam("email") String email){
        ModelAndView model = new ModelAndView();
        model.addObject("paciente",servicioPaciente.readOne(email));
        model.setViewName("/paciente/paciente");
        return model;
    }
}
