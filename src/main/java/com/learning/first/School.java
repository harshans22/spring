package com.learning.first;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class School{
    @Id
    @GeneratedValue
    private Integer id;


    private String name;

    @OneToMany(mappedBy = "school")
    private List<Student> studentsList;


    public School() {
    }

    public School(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
