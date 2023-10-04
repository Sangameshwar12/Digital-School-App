package Digital_School_App.DSA.Transformer;

import Digital_School_App.DSA.Model.Administration;
import Digital_School_App.DSA.dto.RequestDto.AdministrationRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.AdministrationResponseDto;

public class AdminTransFormer {

    public static Administration AdminRequestDtoToAdmin(AdministrationRequestDto administrationRequestDto){

       return Administration.builder()
                .name(administrationRequestDto.getName())
                .emailId(administrationRequestDto.getEmailId())
                .mobNo(administrationRequestDto.getMobNo())
                .year(administrationRequestDto.getYear())
                .nameOfHeadOfficer(administrationRequestDto.getNameOfHeadOfficer())
                .addressOfAdministration(administrationRequestDto.getAddressOfAdministration())
                .build();
    }

    public static AdministrationResponseDto adminToAdminRequestDto(AdministrationRequestDto administrationRequestDto) {
        return AdministrationResponseDto.builder()
                .name(administrationRequestDto.getName())
                .emailId(administrationRequestDto.getEmailId())
                .mobNo(administrationRequestDto.getMobNo())
                .year(administrationRequestDto.getYear())
                .nameOfHeadOfficer(administrationRequestDto.getNameOfHeadOfficer())
                .addressOfAdministration(administrationRequestDto.getAddressOfAdministration())
                .build();
    }
}
