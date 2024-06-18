package by.damir.springstudentsapp.Controllers;


import by.damir.springstudentsapp.Models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudent(){
        return List.of(
                Student.builder().first_name("Damir").email("ospanbekdamir1@gmail.com").age(19).build(),
                Student.builder().first_name("Alisa").email("somegirl@gmail.com").age(17).build(),
                Student.builder().first_name("Jack").email("someguy@gmail.com").age(22).build()
        );
    }

}
