package Digital_School_App.DSA.Service.ServiceImpl;

import Digital_School_App.DSA.Model.Principal;
import Digital_School_App.DSA.Model.School;
import Digital_School_App.DSA.Repositary.PrincipalRepository;
import Digital_School_App.DSA.Repositary.SchoolRepository;
import Digital_School_App.DSA.Service.PrincipalService;
import Digital_School_App.DSA.Transformer.PrincipalTransformer;
import Digital_School_App.DSA.dto.RequestDto.PrinipalRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.PrincipalResponseDto;
import Digital_School_App.DSA.exception.PricipalAlreadyExistException;
import Digital_School_App.DSA.exception.SchoolNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrincipalServiceimpl implements PrincipalService {
    @Autowired
     PrincipalRepository principalRepository;

    @Autowired
    SchoolRepository schoolRepository;
    @Override
    public PrincipalResponseDto addPrincipal(PrinipalRequestDto prinipalRequestDto) throws SchoolNotFoundException, PricipalAlreadyExistException {

        School school = schoolRepository.findByCodeOfSchool(prinipalRequestDto.getCodeOfSchool());
        if(school == null){
            throw new SchoolNotFoundException("School is not registered! register School first");
        }
        Principal principal1 = principalRepository.findByEmailId(prinipalRequestDto.getEmailId());
        if(principal1 != null){
            throw new PricipalAlreadyExistException("Principal Already Exist!");
        }



        Principal principal = PrincipalTransformer.principalRequestDtoToPrincipal(prinipalRequestDto);

        principal.setSchool(school);

        Principal savedPrincipal =  principalRepository.save(principal);
        school.setPrincipal(principal);
        school.getPrincipal().setId(principal.getId());

        schoolRepository.save(school);

        return PrincipalTransformer.principalToResponseDto(savedPrincipal);

    }
}
