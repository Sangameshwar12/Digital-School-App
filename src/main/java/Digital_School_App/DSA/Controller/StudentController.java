package Digital_School_App.DSA.Controller;

import Digital_School_App.DSA.Service.ServiceImpl.StudentServiceImpl;
import Digital_School_App.DSA.Service.StudentService;
import Digital_School_App.DSA.dto.RequestDto.StudentRequestDto;
import Digital_School_App.DSA.dto.ResponseDto.StudentResponseDto;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StudentServiceImpl studentService;
    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody StudentRequestDto studentRequestDto){

        StudentResponseDto studentResponseDto = studentService.addStudent(studentRequestDto);
        return new ResponseEntity<>(studentResponseDto, HttpStatus.CREATED);

    }
}
