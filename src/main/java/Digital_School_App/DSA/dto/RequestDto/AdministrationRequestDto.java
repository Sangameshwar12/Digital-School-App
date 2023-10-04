package Digital_School_App.DSA.dto.RequestDto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdministrationRequestDto {
     String name;

     String emailId;

     String addressOfAdministration;

     String nameOfHeadOfficer;

     String mobNo;

     int year;
}
