package com.xpanxion.assignments.student;

public class Repository implements DataAccess {
    
    public Person getPerson(){
        Person p = new Person(1,"John","Doe");

        return p;
    }
}
