package Digital_School_App.DSA.Service.ServiceImpl;

import Digital_School_App.DSA.Model.School;
import Digital_School_App.DSA.Model.Student;
import Digital_School_App.DSA.Repositary.SchoolRepository;
import Digital_School_App.DSA.Repositary.StudentRepository;
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
            throw new SchoolNotFoundException("School Not found");
        }
        Student student = StudentTransformer.studentRequestDtoToStudent(studentRequestDto);

        if(studentRequestDto.getPreviousResult() == "YES"){
            int currStd = studentRequestDto.getStandard() + 1;

            student.setStandard(currStd);

        }
        int totalStudents = school.getNoOfStudents()+1;
        school.setNoOfStudents(totalStudents);

        List<Student> students = school.getStudents();
        students.add(student);
        school.setStudents(students);


        schoolRepository.save(school);
        student.setSchool(school);


        Student savedStudent = studentRepository.save(student);

        // student to student responseDto

        StudentResponseDto studentResponseDto =  StudentTransformer.studentToStudentResponseDto(savedStudent);
        studentResponseDto.setNameOfSchool(school.getNameOfSchool());
        return studentResponseDto;
    }
}
