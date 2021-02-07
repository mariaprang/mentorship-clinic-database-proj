package clinicDatabase.services;

import clinicDatabase.models.Patient;
import clinicDatabase.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    /*cteartes the reference for the patient repository interface*/
    public PatientRepository patientRepository;

    //add methods for patient crud- create, read, update, delete, +findById and findAll
    //this does both creating and updating the list of patients
    public void savePatient(Patient patient){
            patientRepository.save(patient);// this line does the "insert" elements behind the scene
        }

     public Patient getPatientByEmail(String email){
        return patientRepository.findPatientByEmail(email);
     }

    public Patient getPatientById(Integer id){
        return patientRepository.findById(id).get();
    }

    public List<Patient>  getAllPatients(){
        return (List) patientRepository.findAll();
    }

    public void removePatient(Patient patientToRemove){
        patientRepository.delete(patientToRemove);
     }




}
