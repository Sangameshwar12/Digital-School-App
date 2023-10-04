package Digital_School_App.DSA.Transformer;

import Digital_School_App.DSA.Model.School;
import Digital_School_App.DSA.dto.RequestDto.SchoolRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.SchoolResponseDto;

public class SchoolTransformer {

    public static School schoolRequestDtoToSchool(SchoolRequestDto schoolRequestDto){

        return School.builder()
                .addressOfSchool(schoolRequestDto.getAddressOfSchool())
                .codeOfSchool(schoolRequestDto.getCodOfSchool())
                .nameOfSchool(schoolRequestDto.getNameOfSchool())
                .year(schoolRequestDto.getYear())
                .noOfStudents(schoolRequestDto.getNoOfStudents())
                .build();
    }

    public static SchoolResponseDto schoolToSchoolResponseDto(School school){

        return SchoolResponseDto.builder()
                .codeOfSchool(school.getCodeOfSchool())
                .addressOfSchool(school.getAddressOfSchool())
                .nameOfSchool(school.getNameOfSchool())
                .year(school.getYear())
                .nameOfAdministration(school.getAdministration().getName())
                .build();
    }
}
