package clinicDatabase.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String specialty;
    private String clinicName;
    private String imageURL;

    public Doctor(){}
    /*No Id in our constructor*/
    public Doctor(String name, String specialty,  String clinicName, String imageURL) {
        this.name = name;
        this.specialty = specialty;
        this.clinicName = clinicName;
        this.imageURL = imageURL;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
