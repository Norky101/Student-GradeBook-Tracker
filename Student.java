package classespackage;

/* This is part of the starter code!
 * You need to complete this class yourself!*/

import java.util.*;

public class Student // keeps track of student data
{
    private String firstName;
    private String lastName;
    private int pid;
    private int grade;
    //private  int score;
//----------------------------------------------------------------------------------------------------
    // Getters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getPid()
    {
        return pid;
    }
    public int getGrade()
    {
        return grade;
    }

    //----------------------------------------------------------------------------------------------------
    //setters
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setPid(int pid)
    {
        this.pid = pid;
    }
    public void setGrade(int grade)
    {
        this.grade = grade;
    }

//----------------------------------------------------------------------------------------------------
    // CUSTOM CONSTRUCTOR

    Student(String firstName, String lastName, int pid, int grade)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pid = pid;
        this.grade =grade;
        //this.score = score;
    }
//----------------------------------------------------------------------------------------------------
    // Default constructor

    Student()
    {
        this.firstName = "";
        this.lastName = "";
        this.pid = 0;
        this.grade = 0;
    }
//----------------------------------------------------------------------------------------------------
} //end of student class
















