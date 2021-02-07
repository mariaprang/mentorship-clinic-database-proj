package clinicDatabase.initialData;

import clinicDatabase.models.Doctor;
import clinicDatabase.models.Patient;
import clinicDatabase.services.DoctorService;
import clinicDatabase.services.PatientService;
import org.apache.catalina.StoreManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class InitialData {

    @Autowired
    PatientService patientService;

    @Autowired
    DoctorService doctorService;

    @PostConstruct
    public void initializedInfo(){
        Patient patient1 = new Patient("Tom", "Doe", "tom@gmail.com", "Germany");
        Patient patient2 = new Patient("Anna", "Karnina", "anna@gmail.com", "Russia");

        patientService.savePatient(patient1);
        patientService.savePatient(patient2);

        Doctor doctor1 = new Doctor("Paul Ekman", "Dentist", "SmileStudio", "https://ygeia4u.gr/wp-content/uploads/2016/06/doctor-300x300.png");
        Doctor doctor2 = new Doctor("Hedieh Shafaee", "Surgeon", "Charite", "https://www.drshikhasharma.com/wp-content/uploads/2018/01/21134135/Doctor-300x300.png");
        Doctor doctor3 = new Doctor("Tom Hanks", "oncologist", "MeoKlinik","https://img.lovepik.com/element/40163/3016.png_300.png");
        Doctor doctor4 = new Doctor("Anna Sadok", "Cardiologist", "Charite","https://www.seekpng.com/png/small/26-262828_ladydoctor-1024x1024-lady-doctor-image-png.png");
        Doctor doctor5 = new Doctor("Peter Wein", "Dentist", "SmileStudio","https://cy-smc.com/wp-content/uploads/2020/06/Biomedicine-Doctor-xydas-300x300.png");

//        Doctor doctor6 = new Doctor("Paul Ekman", "Dentist", "SmileStudio", "https://ygeia4u.gr/wp-content/uploads/2016/06/doctor-300x300.png");
//        Doctor doctor7 = new Doctor("Hedieh Shafaee", "Surgery", "Charite", "https://www.drshikhasharma.com/wp-content/uploads/2018/01/21134135/Doctor-300x300.png");
//        Doctor doctor8 = new Doctor("Tom Hanks", "oncologist", "MeoKlinik","https://img.lovepik.com/element/40163/3016.png_300.png");
//        Doctor doctor9 = new Doctor("Anna Sadok", "Cardiologist", "Charite","https://www.seekpng.com/png/small/26-262828_ladydoctor-1024x1024-lady-doctor-image-png.png");
//        Doctor doctor10 = new Doctor("Peter Wein", "Dentist", "SmileStudio","https://cy-smc.com/wp-content/uploads/2020/06/Biomedicine-Doctor-xydas-300x300.png");

        doctorService.saveDoctor(doctor1);
        doctorService.saveDoctor(doctor2);
        doctorService.saveDoctor(doctor3);
        doctorService.saveDoctor(doctor4);
        doctorService.saveDoctor(doctor5);
//        doctorService.saveDoctor(doctor6);
//        doctorService.saveDoctor(doctor7);
//        doctorService.saveDoctor(doctor8);
//        doctorService.saveDoctor(doctor9);
//        doctorService.saveDoctor(doctor10);


    }

}
