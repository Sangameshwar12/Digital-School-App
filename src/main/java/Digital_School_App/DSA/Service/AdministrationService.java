package Digital_School_App.DSA.Service;

import Digital_School_App.DSA.Model.School;
import Digital_School_App.DSA.dto.RequestDto.AdministrationRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.AdministrationResponseDto;
import Digital_School_App.DSA.exception.AdministrationNotFoundException;

import java.util.List;

public interface AdministrationService {

    public AdministrationResponseDto addAdministration(AdministrationRequestDto administrationRequestDto) ;

    public List<School> getAllSchool(String emailId);

}
