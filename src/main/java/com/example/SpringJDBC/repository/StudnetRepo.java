package com.example.SpringJDBC.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.SpringJDBC.model.Student;

@Repository
public class StudnetRepo {

    public void save() {
        System.out.println("Studnet Data Saved");
    }

    public List<Student> findAll() {
        
        List<Student> students = new ArrayList<Student>();
        return students;
    }


}
