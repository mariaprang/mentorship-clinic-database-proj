package clinicDatabase.controllers;

import clinicDatabase.models.Doctor;
import clinicDatabase.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

import java.util.ArrayList;

@Controller
public class HomePageController {

    @Autowired
    DoctorService doctorService;

   @RequestMapping(value = {"/", "/index", "/home" })
   //request comes before the method!

    public String showHomePage(Model model){
       ArrayList<Doctor> doctorArrayList = (ArrayList<Doctor>) doctorService.getAllDoctor();
       model.addAttribute("allDoctors", doctorArrayList);
        return "index";

    }



}
