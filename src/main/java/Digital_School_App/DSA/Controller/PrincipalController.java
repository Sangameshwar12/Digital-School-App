package Digital_School_App.DSA.Controller;

import Digital_School_App.DSA.Service.PrincipalService;
import Digital_School_App.DSA.dto.RequestDto.PrinipalRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.PrincipalResponseDto;
import Digital_School_App.DSA.exception.PricipalAlreadyExistException;
import Digital_School_App.DSA.exception.SchoolNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/principal")
public class PrincipalController {

    @Autowired
    PrincipalService principalService;
    @PostMapping("/add")
    public ResponseEntity addPrincipal(@RequestBody PrinipalRequestDto prinipalRequestDto){

        try {
            PrincipalResponseDto principalResponseDto = principalService.addPrincipal(prinipalRequestDto);
            return new ResponseEntity(principalResponseDto, HttpStatus.CREATED);
        } catch (SchoolNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (PricipalAlreadyExistException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.ALREADY_REPORTED);
        }
    }
}
