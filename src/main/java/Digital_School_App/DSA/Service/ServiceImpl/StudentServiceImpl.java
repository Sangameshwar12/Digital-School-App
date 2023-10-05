package Digital_School_App.DSA.Service.ServiceImpl;

import Digital_School_App.DSA.Model.School;
import Digital_School_App.DSA.Model.Student;
import Digital_School_App.DSA.Repositary.SchoolRepository;
import Digital_School_App.DSA.Repositary.StudentRepository;
import Digital_School_App.DSA.Repositary.TeacherRepository;
import Digital_School_App.DSA.Transformer.StudentTransformer;
import Digital_School_App.DSA.dto.RequestDto.StudentRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.StudentResponseDto;
import Digital_School_App.DSA.exception.SchoolNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    StudentRepository studentRepository;

    public StudentResponseDto addStudent(StudentRequestDto studentRequestDto) throws SchoolNotFoundException {

        // if the student is new for registering the first time
        School school = schoolRepository.findByCodeOfSchool(studentRequestDto.getCodeOfSchool());
        if(school == null){
            throw new SchoolNotFoundException("School not registered with portal");
        }

        int currStd = studentRequestDto.getStandard();
        studentRequestDto.setStandard(currStd + 1);
        int currStudents = school.getNoOfStudents() + 1;
        school.setNoOfStudents(currStudents);


        Student student = StudentTransformer.studentReqDtoToStudent(studentRequestDto);
        List<Student> students = school.getStudents();
        students.add(student);

        schoolRepository.save(school);

        Student savedStudent = studentRepository.save(student);

        StudentResponseDto studentResponseDto = StudentTransformer.studentToStudentResponseDto(savedStudent);
        studentResponseDto.setNameOfSchool(school.getNameOfSchool());

        return studentResponseDto;

    }
}
