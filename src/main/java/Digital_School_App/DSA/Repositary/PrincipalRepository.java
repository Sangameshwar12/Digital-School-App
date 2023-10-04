package Digital_School_App.DSA.Repositary;

import Digital_School_App.DSA.Model.Principal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrincipalRepository extends JpaRepository<Principal, Integer>{

    Principal findByEmailId(String emailId);
}
