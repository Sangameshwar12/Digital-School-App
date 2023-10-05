package Digital_School_App.DSA.Service.ServiceImpl;

import Digital_School_App.DSA.Model.School;
import Digital_School_App.DSA.Model.Teacher;
import Digital_School_App.DSA.Repositary.SchoolRepository;
import Digital_School_App.DSA.Repositary.TeacherRepository;
import Digital_School_App.DSA.Service.TeacherService;
import Digital_School_App.DSA.Transformer.TeacherTransformer;
import Digital_School_App.DSA.dto.RequestDto.TeacherRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.SchoolResponseDto;
import Digital_School_App.DSA.dto.ResponseDto.TeacherResponseDto;
import Digital_School_App.DSA.exception.SchoolNotFoundException;
import Digital_School_App.DSA.exception.TeacherAlreadyRegistered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TecherServiceImpl implements TeacherService {

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public TeacherResponseDto addTeacher(TeacherRequestDto teacherRequestDto) throws SchoolNotFoundException, TeacherAlreadyRegistered {

        if(teacherRepository.findByEmailId(teacherRequestDto.getEmailId()) != null){
            throw new TeacherAlreadyRegistered("Teacher Already Registered!");
        }

        School school = schoolRepository.findByCodeOfSchool(teacherRequestDto.getCodeOfSchool());
        if(school == null){
            throw new SchoolNotFoundException("School hasn't registered");
        }

        List<Teacher> teachers = school.getTeachers();


        // techer request dto to teacher object
        Teacher teacher = TeacherTransformer.teacherReqstDtoToTeacher(teacherRequestDto);

        teacher.setSchool(school);
        teachers.add(teacher);
        school.setTeachers(teachers);



        schoolRepository.save(school);

        Teacher savedTeacher = teacherRepository.save(teacher);

        // teacher to teacher response Dto;

        TeacherResponseDto teacherResponseDto = TeacherTransformer.teacherToResponseDto(savedTeacher);
        teacherResponseDto.setNameOfSchool(school.getNameOfSchool());

        return teacherResponseDto;
    }
}
