package ru.mirea.task4;

import java.lang.*;
public class Author
{
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g)
    {
        name = n;
        email = e;
        gender = g;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String e)
    {
        email = e;
    }
    public char getGender()
    {
        return gender;
    }
    public String toString()
    {
        return "Author's name is "+this.name+", author's email is "+this.email+" and author's gender is "+this.gender;
    }
}