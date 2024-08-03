package cl.praxis.escuelarural_jpa.controller;

import cl.praxis.escuelarural_jpa.entity.Alumnos;
import cl.praxis.escuelarural_jpa.service.impl.AlumnosServiceImpl;
import cl.praxis.escuelarural_jpa.service.impl.CursosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/Alumnos")
public class FormController {
    @Autowired
    private AlumnosServiceImpl alumnosService;
    @Autowired
    private CursosServiceImpl cursosService;
@GetMapping("/form{id}")
    public String showForm(Model model,@RequestParam List<Long>id){
    Alumnos alumno = alumnosService.findAllStudent()
    return "/form";

}
}
 //el ingreso, edición, selección y eliminación de los
//alumnos,