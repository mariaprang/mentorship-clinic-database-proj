package clinicDatabase.services;

import clinicDatabase.models.Doctor;

import java.util.ArrayList;

public class DoctorPatientMatcher {

    public ArrayList<Doctor> getDoctorByKeyword(ArrayList<Doctor> allDoctors, String userSearchTerm){
        //we can add the lowercase for userSearchTerm on top for all codes related to because
        //it's not in the for loop
        userSearchTerm = userSearchTerm.toLowerCase();
        ArrayList<Doctor> matchDoctors = new ArrayList<>();
        if (userSearchTerm.contains("surgery")
               ||userSearchTerm.contains("injury")){
            for (Doctor doctor : allDoctors){
                if (doctor.getSpecialty().toLowerCase().contains("surgeon")){
                    matchDoctors.add(doctor);
                }
            }
        }

        if (userSearchTerm.contains("tooth") || userSearchTerm.contains("dental") ||
                userSearchTerm.contains("teeth")) {
            for (Doctor doctor :allDoctors){
                if (doctor.getSpecialty().toLowerCase().contains("dentist")){
                    matchDoctors.add(doctor);
                }
            }
        }

        if (userSearchTerm.contains("oncology")
                ||userSearchTerm.contains("cancer")){
            for (Doctor doctor : allDoctors){
                if (doctor.getSpecialty().toLowerCase().contains("oncologist")){
                    matchDoctors.add(doctor);
                }
            }
        }

        if (userSearchTerm.contains("heart")
                ||userSearchTerm.contains("cardiac")){
            for (Doctor doctor : allDoctors){
                if (doctor.getSpecialty().toLowerCase().contains("cardialogist")){
                    matchDoctors.add(doctor);
                }
            }
        }
        return matchDoctors;
    }
}
