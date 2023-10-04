package Digital_School_App.DSA.Transformer;

import Digital_School_App.DSA.Model.Student;
import Digital_School_App.DSA.dto.RequestDto.StudentRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.StudentResponseDto;

public class StudentTransformer {

    public static Student studentRequestDtoToStudent(StudentRequestDto studentRequestDto){

        return Student.builder()
                .nameOfStudent(studentRequestDto.getNameOfStudent())
                .age(studentRequestDto.getAge())
                .dob(studentRequestDto.getDate())
                .Standard(studentRequestDto.getStandard())
                .previousResult(studentRequestDto.getPreviousResult())
                .build();
    }

    public static StudentResponseDto studentToStudentResponseDto(Student savedStudent) {

        return StudentResponseDto.builder()
                .age(savedStudent.getAge())
                .gender(savedStudent.getGender())
                .nameOfSchool(savedStudent.getSchool().getNameOfSchool())
                .nameOfString(savedStudent.getNameOfStudent())
                .build();
    }
}
