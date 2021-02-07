package clinicDatabase.controllers;

import clinicDatabase.models.Doctor;
import clinicDatabase.models.Patient;
import clinicDatabase.services.DoctorPatientMatcher;
import clinicDatabase.services.DoctorService;
import clinicDatabase.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class PatientFormController {

        @Autowired
        PatientService patientService;

        @Autowired
        DoctorService doctorService;

        @RequestMapping("/showPatientForm")
        public String showClinicForm(){
            //in return it should be called the exact name of the class ex: about us
            return "clinic-form";
        }

        @RequestMapping("/acceptPatientForm")
        public String acceptPatientRequest(@RequestParam("first-name") String firstName,
                                       @RequestParam("last-name") String lastName,
                                       @RequestParam("email") String email,
                                       @RequestParam("country") String country,
                                       @RequestParam("diagnosis") String diagnosis,
                                           Model model){
            //check if already exists?
            //if no-add and then show the options
            //if yes- show them the treatment options
            //* show treatment options on a new pag

            Patient patient = patientService.getPatientByEmail(email);
            if (patient == null){
                //doesn't exist
                Patient patientToCreate = new Patient(firstName, lastName, email, country);
                patientService.savePatient(patientToCreate);
            }

            ArrayList<Doctor> doctors = (ArrayList) doctorService.getAllDoctor();
            DoctorPatientMatcher doctorPatientMatcher = new DoctorPatientMatcher();
            doctors = doctorPatientMatcher.getDoctorByKeyword(doctors, diagnosis);

            // code here to search for all treatment options and doctors
            model.addAttribute("allDoctors", doctors);

            //using the REDIRECT:/index would redirect to homepagecontroller
            // which you would get all doctors
            return "/index";// we add later


        }

}
