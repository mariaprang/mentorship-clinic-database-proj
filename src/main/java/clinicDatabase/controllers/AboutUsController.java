package clinicDatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {
    //in request it doesn't need to be exactly be calling about us
    @RequestMapping("/about")
    public String showAboutUsPage(){
        //in return it should be called the exact name of the class ex: about us
        return "about-us";
    }
}
