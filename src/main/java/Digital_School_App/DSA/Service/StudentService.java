package Digital_School_App.DSA.Service;

import Digital_School_App.DSA.dto.RequestDto.StudentRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.StudentResponseDto;

public interface StudentService {

    public StudentResponseDto addStudent(StudentRequestDto studentRequestDto);

}
