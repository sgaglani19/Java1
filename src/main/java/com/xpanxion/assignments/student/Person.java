package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private static ArrayList<Person> people = new ArrayList<>();

    public Person(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        people.add(this);
    }

    
    public static ArrayList<Person> getPeopleList(){
        return people;
    }

    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return "Person{id=" + getId()+", firstName=\'" + getFirstName() + "\', lastName=\'" + getLastName() + "\'}";   
    }

    public int compareTo(Person p){
        return getFirstName().compareTo(p.getFirstName());
    }





}
