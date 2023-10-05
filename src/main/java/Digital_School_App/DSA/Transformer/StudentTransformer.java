package Digital_School_App.DSA.Transformer;

import Digital_School_App.DSA.Model.Student;
import Digital_School_App.DSA.dto.RequestDto.StudentRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.StudentResponseDto;

public class StudentTransformer {

    public static Student studentReqDtoToStudent(StudentRequestDto studentRequestDto){
        return Student.builder()
                .nameOfStudent(studentRequestDto.getNameOfStudent())
                .age(studentRequestDto.getAge())
                .gender(studentRequestDto.getGender())
                .dob(studentRequestDto.getDate())
                .Standard(studentRequestDto.getStandard())
                .previousResult(studentRequestDto.getPreviousResult())
                .build();
    }

    public static StudentResponseDto studentToStudentResponseDto(Student savedStudent) {

        return StudentResponseDto.builder()
                .nameOfString(savedStudent.getNameOfStudent())
                .gender(savedStudent.getGender())
                .standard(savedStudent.getStandard())
                .age(savedStudent.getAge())
                .build();
    }
}
