package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// decorador @RestController encargado de rutear endpoints.

@RestController
public class StudentController {

    // atributo encapsulado de clase para lista de estrudioantes.
    private List<Student> students = new ArrayList<>();

    // constructor de clase sin parametros, definiendo estudiantes enduro (raw).
    public StudentController()
    {
        students.add(new Student(1, "Belen Rodriguez"));
        students.add(new Student(2, "Igancio Riquelme"));
    }

    // endpoint metodo get para retornar la lista completta de estudiantes.
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    //endpoint metodo get estudiantes por id  para retornar un estudiante en especifico retorna nulo si no existe.
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        for (Student student : students)
        {
            if (student.getId() == id)
            {
                return student;
            }
        }
        return null;
    }
        
}