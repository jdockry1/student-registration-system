/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.studentregistrationsystem.Student;
import java.util.Date;

/**
 *
 * @author Joe
 */
public class GetUsernameTest {
    
    private final String name = "Joe";
    private final int age = 20;
    private final Date DOB = new Date(97, 2, 12);
    private final int ID = 14457102;
    private Student student;
    
    public GetUsernameTest () {
    }
    
    @Before
    public void setUp () {
        student = new Student(name, age, DOB, ID);
    }
    
    @After
    public void tearDown () {
    }

    @Test
    public void GetUsernameTest () {
        String expectedResult = "Joe20";
        String actualResult = student.getUsername();
        
        assertEquals(expectedResult, actualResult);
    }
}
