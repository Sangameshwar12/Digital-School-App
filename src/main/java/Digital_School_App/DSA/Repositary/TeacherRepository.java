package Digital_School_App.DSA.Repositary;

import Digital_School_App.DSA.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    Teacher findByEmailId(String emaildId);
}
