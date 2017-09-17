/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentregistrationsystem;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author Joe
 */
public class CourseProgramme {
    
    // Member Variables
    
    private String name;
    private List<Module> modules;
    private DateTime startDate;
    private DateTime endDate;
    
    // Constructor Methods
    
    public CourseProgramme () {
        this.modules = new ArrayList<Module>();
    }
    
    public CourseProgramme (String name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modules = new ArrayList<Module>();
    }
    
    public CourseProgramme (String name, DateTime startDate, DateTime endDate, List<Module> modules) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modules = modules;
    }
    
    // Accessor Methods
    
    public String getName () {
        return this.name;
    }
    
    public DateTime getStartDate () {
        return this.startDate;
    }
    
    public DateTime getEndDate () {
        return this.endDate;
    }
    
    public List<Module> getModules () {
        return this.modules;
    }
    
    // Mutator Methods
    
    public void setName (String name) {
        this.name = name;
    }
    
    public void setStartDate (DateTime startDate) {
        this.startDate = startDate;
    }
    
    public void setEndDate (DateTime endDate) {
        this.endDate = endDate;
    }
    
    public void setModules (List<Module> modules) {
        this.modules = modules;
    }
    
    // Adds a new module to the list of modules
    
    public void addModule (Module module) {
        this.modules.add(module);
    }
    
    public Module getModuleByName (String name ) {
        for (Module module : modules) {
            if (module.getName().equals(name)) {
                return module;
            }
        }
        return null;
    }
    
}
