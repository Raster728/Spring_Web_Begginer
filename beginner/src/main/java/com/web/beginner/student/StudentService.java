package com.web.beginner.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(1L, "Rita Silva", "anaaritasilva@gmail.com", LocalDate.of(2003, Month.JUNE, 18), 20)
        );
    }

}
