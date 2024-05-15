package com.example.SpringJDBC.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

     int id;
     String name;
     int marks;

     

    public Student(){
        System.out.println("Student object created");
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getMarks() {
        return marks;
    }



    public void setMarks(int marks) {
        this.marks = marks;
    }
}
