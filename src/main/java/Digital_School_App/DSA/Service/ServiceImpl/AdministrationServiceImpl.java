package Digital_School_App.DSA.Service.ServiceImpl;

import Digital_School_App.DSA.Model.Administration;
import Digital_School_App.DSA.Model.School;
import Digital_School_App.DSA.Repositary.AdministrationRepository;
import Digital_School_App.DSA.Service.AdministrationService;
import Digital_School_App.DSA.Transformer.AdminTransFormer;
import Digital_School_App.DSA.dto.RequestDto.AdministrationRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.AdministrationResponseDto;
import Digital_School_App.DSA.exception.AdministrationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdministrationServiceImpl implements AdministrationService {

    @Autowired
    AdministrationRepository administrationRepository;
    @Override
    public AdministrationResponseDto addAdministration(AdministrationRequestDto administrationRequestDto)  {

        Administration administration = AdminTransFormer.AdminRequestDtoToAdmin(administrationRequestDto);

        Administration savedAdmin = administrationRepository.save(administration);

        return AdminTransFormer.adminToAdminRequestDto(administrationRequestDto);


    }

    @Override
    public List<School> getAllSchool(String emailId) {

        Administration administration = administrationRepository.findByEmailId(emailId);
        List<School> schools = administration.getSchools();

        return schools;
    }
}
