/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentregistrationsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joe
 */
public class Module {
    
    // Member Variables
    
    private String name;
    private String ID;
    private List<Student> students;
    
    // Constructor Methods
    
    public Module () {
        this.students = new ArrayList<Student>();
    }
    
    public Module (String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.students = new ArrayList<Student>();
    }
    
    public Module (String name, String ID, List<Student> students) {
        this.name = name;
        this.ID = ID;
        this.students = students;
    }
    
    // Accessor Methods
    
    public String getName () {
        return this.name;
    }
    
    public String getID () {
        return this.ID;
    }
    
    public List<Student> getStudents () {
        return this.students;
    }
    
    // Mutator Methods
    
    public void setName (String name) {
        this.name = name;
    }
    
    public void setID (String ID) {
        this.ID = ID;
    }
    
    public void setStudents (List<Student> students) {
        this.students = students;
    }
    
    // Adds a new student to the list of students
    
    public void addStudent (Student student) {
        this.students.add(student);
    }
    
    public Student getStudentByName (String name ) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
    
}
