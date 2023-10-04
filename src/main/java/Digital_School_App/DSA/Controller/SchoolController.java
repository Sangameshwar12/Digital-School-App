package Digital_School_App.DSA.Controller;

import Digital_School_App.DSA.Service.SchoolService;
import Digital_School_App.DSA.Service.ServiceImpl.SchoolServiceImpl;
import Digital_School_App.DSA.dto.RequestDto.SchoolRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.SchoolResponseDto;
import Digital_School_App.DSA.exception.AdministrationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;
    @PostMapping("/add")
    public ResponseEntity addSchool(@RequestBody SchoolRequestDto schoolRequestDto){
        try {
            SchoolResponseDto schoolResponseDto = schoolService.addSchool(schoolRequestDto);
            return new ResponseEntity(schoolResponseDto, HttpStatus.CREATED);
        } catch (AdministrationNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }



}
