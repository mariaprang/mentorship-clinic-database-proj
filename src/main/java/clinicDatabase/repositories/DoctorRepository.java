package clinicDatabase.repositories;

import clinicDatabase.models.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository <Doctor, Integer>{

    public Doctor findDoctorBySpecialty(String specialty);
}
