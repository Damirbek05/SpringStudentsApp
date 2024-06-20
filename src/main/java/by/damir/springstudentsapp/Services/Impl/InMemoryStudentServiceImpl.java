package by.damir.springstudentsapp.Services.Impl;

import by.damir.springstudentsapp.Models.Student;
import by.damir.springstudentsapp.Services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService {


    @Override
    public List<Student> findAllStudent() {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(String email) {
        return null;
    }
}
