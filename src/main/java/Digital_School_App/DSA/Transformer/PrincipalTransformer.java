package Digital_School_App.DSA.Transformer;

import Digital_School_App.DSA.Model.Principal;
import Digital_School_App.DSA.dto.RequestDto.PrinipalRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.PrincipalResponseDto;

public class PrincipalTransformer {
    public static Principal principalRequestDtoToPrincipal(PrinipalRequestDto prinipalRequestDto){

        return Principal.builder()
                .age(prinipalRequestDto.getAge())
                .name(prinipalRequestDto.getName())
                .mobNo(prinipalRequestDto.getMobNo())
                .gender(prinipalRequestDto.getGender())
                .emailId(prinipalRequestDto.getEmailId())
                .build();
    }

    public static PrincipalResponseDto principalToResponseDto(Principal principal){

        return PrincipalResponseDto.builder()
                .age(principal.getAge())
                .nameOfPrincipal(principal.getName())
                .emailId(principal.getEmailId())
                .nameOfSchool(principal.getSchool().getNameOfSchool())
                .mobNo(principal.getMobNo())
                .build();
    }
}

