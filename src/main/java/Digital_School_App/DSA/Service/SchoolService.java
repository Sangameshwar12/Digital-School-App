package Digital_School_App.DSA.Service;

import Digital_School_App.DSA.dto.RequestDto.SchoolRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.SchoolResponseDto;
import Digital_School_App.DSA.exception.AdministrationNotFoundException;

public interface SchoolService {
    public SchoolResponseDto addSchool(SchoolRequestDto schoolRequestDto) throws AdministrationNotFoundException;
}
