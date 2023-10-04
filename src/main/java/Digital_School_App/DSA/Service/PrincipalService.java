package Digital_School_App.DSA.Service;

import Digital_School_App.DSA.dto.RequestDto.PrinipalRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.PrincipalResponseDto;
import Digital_School_App.DSA.exception.PricipalAlreadyExistException;
import Digital_School_App.DSA.exception.SchoolNotFoundException;

public interface PrincipalService {

    public PrincipalResponseDto addPrincipal(PrinipalRequestDto prinipalRequestDto) throws SchoolNotFoundException, PricipalAlreadyExistException;
}
