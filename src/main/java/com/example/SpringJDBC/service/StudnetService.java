package com.example.SpringJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringJDBC.model.Student;
import com.example.SpringJDBC.repository.StudnetRepo;

@Service
public class StudnetService {


     StudnetRepo repo;

    public StudnetRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudnetRepo repo) {
        this.repo = repo;
    }

    public  void addStudent(Student student) {
        repo.save(student);
    }

    public List<Student> getStudentList() {
        return repo.findAll();
    }


}
