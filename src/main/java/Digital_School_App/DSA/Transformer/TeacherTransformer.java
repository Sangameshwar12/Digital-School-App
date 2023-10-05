package Digital_School_App.DSA.Transformer;

import Digital_School_App.DSA.Model.Teacher;
import Digital_School_App.DSA.dto.RequestDto.TeacherRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.TeacherResponseDto;

public class TeacherTransformer {

    public static Teacher teacherReqstDtoToTeacher(TeacherRequestDto teacherRequestDto){

        return Teacher.builder()
                .name(teacherRequestDto.getNameOfTeacher())
                .age(teacherRequestDto.getAge())
                .gender(teacherRequestDto.getGender())
                .mobNo(teacherRequestDto.getMobNo())
                .emailId(teacherRequestDto.getEmailId())
                .subject(teacherRequestDto.getSubject())
                .build();
    }

    public static TeacherResponseDto teacherToResponseDto(Teacher savedTeacher) {

        return TeacherResponseDto.builder()
                .name(savedTeacher.getName())
                .age(savedTeacher.getAge())
                .mobNo(savedTeacher.getMobNo())
                .subject(savedTeacher.getSubject())
                .gender(savedTeacher.getGender())
                .build();
    }
}
