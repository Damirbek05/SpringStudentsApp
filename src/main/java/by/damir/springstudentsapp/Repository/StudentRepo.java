package by.damir.springstudentsapp.Repository;

import by.damir.springstudentsapp.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student,Long> {
    Student findStudentByEmail(String email);

    void deleteByEmail(String email);

}
