package com.generation.model;

import java.util.ArrayList;
import java.util.Date;

abstract public class Person
{
    private final String id;
    private final String name;
    private final String email;
    private final Date birthDate;

    private final ArrayList<Course> enrolledCourses;

    protected Person( String id, String name, String email, Date birthDate )
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;

        //Create an empty ArrayList - enrolledCourses
        enrolledCourses = new ArrayList<>();
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    @Override
    public String toString()
    {
        return id + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + ", birthDate=" + birthDate;
    }
}
