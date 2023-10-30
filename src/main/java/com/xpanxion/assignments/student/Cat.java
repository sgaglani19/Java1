package com.xpanxion.assignments.student;

import java.util.LinkedList;

public class Cat {
    private String name;

    private static LinkedList<Cat> queue = new LinkedList<>();

    public Cat(String name){
        this.name = name;
        // queue.add(this);
    }

    public static LinkedList<Cat> getCatList(){
        return queue;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Cat{name=" + getName() + "}, ";
    }
}
