package Digital_School_App.DSA.dto.ResponseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdministrationResponseDto {
    String name;

    String emailId;

    String addressOfAdministration;

    String nameOfHeadOfficer;

    String mobNo;

    int year;
}
