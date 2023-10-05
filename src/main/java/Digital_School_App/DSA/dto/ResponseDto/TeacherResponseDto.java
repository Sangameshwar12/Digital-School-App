package Digital_School_App.DSA.dto.ResponseDto;

import Digital_School_App.DSA.Enum.Gender;
import Digital_School_App.DSA.Enum.Subject;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class TeacherResponseDto {

    String name;

    int age;

    Gender gender;

    String mobNo;

    String nameOfSchool;

    Subject subject;


}
