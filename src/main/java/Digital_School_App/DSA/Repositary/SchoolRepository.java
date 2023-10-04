package Digital_School_App.DSA.Repositary;

import Digital_School_App.DSA.Model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
    School findByCodeOfSchool(int codeOfSchool);
}
