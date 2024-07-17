package by.damir.springstudentsapp.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue
    private long id;

    private String first_name;
    private String last_name;
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public int getAge(){
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

}
