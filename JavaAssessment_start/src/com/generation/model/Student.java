package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation


{
    private ArrayList<Course> enrolledCourses;

    float PASS_MIN_GRADE = 3.0f;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate);
        //create an empty enrolledCourse ArrayList
        enrolledCourses = new ArrayList<>();

    }


    public void enrollToCourse( Course course )
    {
        //TODO
    enrolledCourses.add(course);
    }


    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        return null;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
        for (Course i : enrolledCourses){
            if(courseId == i.getCode()){
                    return i;
            }
        }
       return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //returning the enrolledCourses arraylist
        for (Course i : enrolledCourses){
            System.out.println(i);
        }
    return null;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
