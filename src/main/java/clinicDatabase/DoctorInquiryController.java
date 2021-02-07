package clinicDatabase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorInquiryController {


    @RequestMapping("/showDoctorInquiry")
    public String showDoctorInquiryPage(@RequestParam("doctor-name") String name,
                                        Model model) {
        model.addAttribute("doctorName", name);
        return "doctor-inquiry.html";
    }


}
