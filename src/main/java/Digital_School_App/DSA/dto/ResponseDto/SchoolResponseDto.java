package Digital_School_App.DSA.dto.ResponseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SchoolResponseDto {
    String nameOfAdministration;

    String nameOfSchool;

    int codeOfSchool;

    String addressOfSchool;

//    String nameOfPrincipal;

    int year;



}
