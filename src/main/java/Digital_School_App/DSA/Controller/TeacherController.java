package Digital_School_App.DSA.Controller;

import Digital_School_App.DSA.Service.TeacherService;
import Digital_School_App.DSA.dto.RequestDto.TeacherRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.TeacherResponseDto;
import Digital_School_App.DSA.exception.SchoolNotFoundException;
import Digital_School_App.DSA.exception.TeacherAlreadyRegistered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/add")
    public ResponseEntity addTeacher(@RequestBody TeacherRequestDto teacherRequestDto){

        try {
            TeacherResponseDto teacherResponseDto = teacherService.addTeacher(teacherRequestDto);
            return new ResponseEntity(teacherResponseDto, HttpStatus.CREATED);
        } catch (SchoolNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (TeacherAlreadyRegistered e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.ALREADY_REPORTED);
        }
    }
}
