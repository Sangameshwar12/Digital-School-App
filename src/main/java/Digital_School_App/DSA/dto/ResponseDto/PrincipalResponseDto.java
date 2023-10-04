package Digital_School_App.DSA.dto.ResponseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class PrincipalResponseDto {

    String nameOfPrincipal;

    int age;

    String emailId;

    String mobNo;

    String nameOfSchool;



}
