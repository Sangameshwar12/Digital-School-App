package Digital_School_App.DSA.Transformer;

import Digital_School_App.DSA.Model.Student;
import Digital_School_App.DSA.dto.RequestDto.StudentRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.StudentResponseDto;

public class StudentTransformer {

    public static Student studentRequestDtoToStudent(StudentRequestDto studentRequestDto){

        return Student.builder()
                .nameOfStudent(studentRequestDto.getNameOfStudent())
                .age(studentRequestDto.getAge())
                .gender(studentRequestDto.getGender())
                .previousResult(studentRequestDto.getPreviousResult())
                .Standard(studentRequestDto.getStandard())
                .dob(studentRequestDto.getDate())
                .build();
    }

    public static StudentResponseDto studentToStudentResponseDto(Student savedStudent) {

        return StudentResponseDto.builder()
                .age(savedStudent.getAge())
                .gender(savedStudent.getGender())
                .nameOfString(savedStudent.getNameOfStudent())
                .build();
    }
}
