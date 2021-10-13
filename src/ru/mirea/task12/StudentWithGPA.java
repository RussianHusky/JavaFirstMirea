package ru.mirea.task12;

public class StudentWithGPA {
    protected double gpa;
    protected String name;

    StudentWithGPA(double gpa, String name)
    {
        this.gpa = gpa;
        this.name = name;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
