package com.xpanxion.assignments.student;

public abstract class Base {
    protected int id;

    public Base(int id){
        this.id = id;
    }
    
    public abstract int getId();
}
