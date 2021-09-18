package com.rueda.main.controller;

import com.rueda.main.model.Odontologo;
import com.rueda.main.service.OdontologoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/odontologo")
public class OdontologoController {

    private OdontologoService odontologoService = new OdontologoService();

    @GetMapping("/index")
    public String index(){
        return "/odontologo/index";
    }

    @GetMapping("/readOne")
    public ModelAndView readOne(@RequestParam("id") Integer id){
        ModelAndView model = new ModelAndView();
        Odontologo respuesta = odontologoService.readOne(id);
        model.addObject("odontologo",respuesta);
        model.setViewName("/odontologo/odontologo");
        return model;

    }

    @GetMapping("/lista")
    public ModelAndView readALL(){
        ModelAndView model = new ModelAndView();
        model.addObject("odontologos",odontologoService.readAll());
        model.setViewName("/odontologo/lista");
        return model;

    }


}
