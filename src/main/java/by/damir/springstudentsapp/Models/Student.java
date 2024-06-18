package by.damir.springstudentsapp.Models;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
public class Student {
    private String first_name;
    private String last_name;
    private LocalDate dateOfBirth;
    private String email;
    private int age;

}
