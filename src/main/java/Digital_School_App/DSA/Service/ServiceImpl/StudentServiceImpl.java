package Digital_School_App.DSA.Service.ServiceImpl;

import Digital_School_App.DSA.Model.School;
import Digital_School_App.DSA.Model.Student;
import Digital_School_App.DSA.Repositary.SchoolRepository;
import Digital_School_App.DSA.Repositary.StudentRepository;
import Digital_School_App.DSA.Transformer.StudentTransformer;
import Digital_School_App.DSA.dto.RequestDto.StudentRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.StudentResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    StudentRepository studentRepository;

    public StudentResponseDto addStudent(StudentRequestDto studentRequestDto){

        School school = schoolRepository.findByCodeOfSchool(studentRequestDto.getCodeOfSchool());

        // adding the student first time in the school
        // new admission

        Student student = StudentTransformer.studentRequestDtoToStudent(studentRequestDto);

        school.getStudents().add(student);
        schoolRepository.save(school);


       Student savedStudent =  studentRepository.save(student);

       StudentResponseDto studentResponseDto = StudentTransformer.studentToStudentResponseDto(savedStudent);
       return studentResponseDto;

    }
}
