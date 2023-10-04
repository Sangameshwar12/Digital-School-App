package Digital_School_App.DSA.dto.ResponseDto;

import Digital_School_App.DSA.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class StudentResponseDto {

    String nameOfString;

    String nameOfSchool;

    Gender gender;

    int age;

    int standard;
}
