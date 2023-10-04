package Digital_School_App.DSA.Service.ServiceImpl;

import Digital_School_App.DSA.Model.Administration;
import Digital_School_App.DSA.Model.Principal;
import Digital_School_App.DSA.Model.School;
import Digital_School_App.DSA.Repositary.AdministrationRepository;
import Digital_School_App.DSA.Repositary.PrincipalRepository;
import Digital_School_App.DSA.Repositary.SchoolRepository;
import Digital_School_App.DSA.Service.SchoolService;
import Digital_School_App.DSA.Transformer.SchoolTransformer;
import Digital_School_App.DSA.dto.RequestDto.SchoolRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.SchoolResponseDto;
import Digital_School_App.DSA.exception.AdministrationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    AdministrationRepository administrationRepository;

    @Autowired
    PrincipalRepository principalRepository;
    @Override
    public SchoolResponseDto addSchool(SchoolRequestDto schoolRequestDto) throws AdministrationNotFoundException {

        Administration administration = administrationRepository.findByEmailId(schoolRequestDto.getAdminEmailId());
        if(administration == null){
            throw new AdministrationNotFoundException("Administration not found using this email. Please contact to Administration office");
        }

        School school = SchoolTransformer.schoolRequestDtoToSchool(schoolRequestDto);
        school.setAdministration(administration);
        school.getAdministration().getSchools().add(school);
        School savedSchool = schoolRepository.save(school);



        return SchoolTransformer.schoolToSchoolResponseDto(savedSchool);
    }
}
