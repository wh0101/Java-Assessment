package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        //TODO
        //insert student details into hashMap
    students.put(student.getId(), student);
    }

    public Student findStudent( String studentId )
    {
        //TODO
        //using contains key to find in hashMap if key is there, then if it is, return the value
        if(students.containsKey(studentId)){
            return students.get(studentId);
        }
        return null;
    }

    public boolean showSummary()
    {
        //TODO

        for ( String key : students.keySet() )
        {
            Student student = students.get( key );
            System.out.println( student );
            System.out.println("Enrolled Courses: " + '\n'+ student.getEnrolledCourses());


        }
        return true;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        //add course with student id into an arraylist
         students.get(studentId).enrollToCourse(course);

    }

    public void showEnrolledCourse(String studentId){
        students.get(studentId).getEnrolledCourses();
    }

}
