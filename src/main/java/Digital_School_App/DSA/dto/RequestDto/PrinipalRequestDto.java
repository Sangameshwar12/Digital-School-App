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
public class PrinipalRequestDto {

     String name;

     int age;

     String emailId;

     String mobNo;

     Gender gender;

    int codeOfSchool;

}
