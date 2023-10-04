package Digital_School_App.DSA.dto.RequestDto;

import Digital_School_App.DSA.Enum.Gender;
import Digital_School_App.DSA.Model.Parent;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentRequestDto {

    int codeOfSchool;

    String nameOfStudent;

    int age;

    Gender gender;

    Date date;

    int standard;

    String previousResult;


}
