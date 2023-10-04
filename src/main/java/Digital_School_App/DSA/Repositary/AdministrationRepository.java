package Digital_School_App.DSA.Repositary;

import Digital_School_App.DSA.Model.Administration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface AdministrationRepository extends JpaRepository<Administration, Integer> {

    Administration findByEmailId(String emailId);
}
