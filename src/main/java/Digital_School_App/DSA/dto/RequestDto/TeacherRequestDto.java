package Digital_School_App.DSA.dto.RequestDto;

import Digital_School_App.DSA.Enum.Gender;
import Digital_School_App.DSA.Enum.Subject;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class TeacherRequestDto {

    int codeOfSchool;

    String nameOfTeacher;

    int age;

    Gender gender;

    String mobNo;

    String emailId;

    Subject subject;

}
