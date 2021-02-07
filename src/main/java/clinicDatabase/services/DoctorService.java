package clinicDatabase.services;

import clinicDatabase.models.Doctor;
import clinicDatabase.models.Patient;
import clinicDatabase.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public void saveDoctor(Doctor doctor){
        doctorRepository.save(doctor);// this line does the "insert" elements behind the scene
    }

    public Doctor getDoctorBySpecialty(String specialty){
        return doctorRepository.findDoctorBySpecialty(specialty);
    }

    public List<Doctor> getAllDoctor(){
        return (List) doctorRepository.findAll();
    }

    public void removeDoctor(Doctor doctorToRemove){
        doctorRepository.delete(doctorToRemove);
    }


}
