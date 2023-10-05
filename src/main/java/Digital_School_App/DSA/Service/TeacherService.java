package Digital_School_App.DSA.Service;

import Digital_School_App.DSA.Repositary.TeacherRepository;
import Digital_School_App.DSA.dto.RequestDto.TeacherRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.TeacherResponseDto;
import Digital_School_App.DSA.exception.SchoolNotFoundException;
import Digital_School_App.DSA.exception.TeacherAlreadyRegistered;

public interface TeacherService {

    public TeacherResponseDto addTeacher(TeacherRequestDto teacherRequestDto) throws SchoolNotFoundException, TeacherAlreadyRegistered;
}
