/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentregistrationsystem;

import java.util.Date;

/**
 *
 * @author Joe
 */
public class Student {
    
    // Member Variables
    
    private String name;
    private int age;
    private Date DOB;
    private int ID;
    private String username;
    
    // Constructor Methods
    
    public Student () {
    }
    
    public Student (String name, int age, Date DOB, int ID) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
    }
    
    // Accessor Methods
    
    public String getName () {
        return this.name;
    }
    
    public int getAge () {
        return this.age;
    }
    
    public Date getDOB () {
        return this.DOB;
    }
    
    public int getID () {
        return this.ID;
    }
    
    public String getUsername () {
        this.username = this.name + this.age;
        return this.username;
    }
    
    // Mutator Methods
    
    public void setName (String name) {
        this.name = name;
    }
    
    public void setAge (int age) {
        this.age = age;
    }
    
    public void setDOB (Date DOB) {
        this.DOB = DOB;
    }
    
    public void setID (int ID) {
        this.ID = ID;
    }
    
}
