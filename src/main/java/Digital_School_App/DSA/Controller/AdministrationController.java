package Digital_School_App.DSA.Controller;

import Digital_School_App.DSA.Model.School;
import Digital_School_App.DSA.Service.AdministrationService;
import Digital_School_App.DSA.dto.RequestDto.AdministrationRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.AdministrationResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administration")
public class AdministrationController {

    @Autowired
    AdministrationService administrationService;
    @PostMapping("/add")
    public ResponseEntity addAdmin(@RequestBody AdministrationRequestDto administrationRequestDto){

        AdministrationResponseDto administrationResponseDto = administrationService.addAdministration(administrationRequestDto);

        return new ResponseEntity(administrationResponseDto, HttpStatus.CREATED);
    }
    @GetMapping("/all_Schools_under")
    public List<School> getAllSchools(@RequestParam String emailId){
        return administrationService.getAllSchool(emailId);
    }
}
