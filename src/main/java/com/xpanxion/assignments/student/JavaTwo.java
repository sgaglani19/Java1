package com.xpanxion.assignments.student;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaTwo {
    
    public JavaTwo(){

    }

    public void ex1(){
        Scanner input = new Scanner(System.in);
        String data = "";
        Person p;
        int id = 0;
        String firstName = "";
        String lastName = "";
        ArrayList<Person> people = Person.getPeopleList();
        do{
            System.out.print("Enter Person: ");
            data = input.nextLine();
            String[] values = data.split(", ");
            // for(int i = 0; i < values.length; i++){
            //     System.out.println(values[i]);
            // }
            // System.out.println(values);
            if(values.length > 1){
                String fullName = values[1];
                String[] name = fullName.split(" ");
                id = Integer.parseInt(values[0]);
                firstName = name[0];
                lastName = name[1];
                // System.out.println(id);
                // System.out.println(firstName);
                // System.out.println(lastName);   
            }
            p = new Person(id,firstName,lastName);
        }
        while(!data.equals("done"));
        // System.out.println(people.toString());
        for(int i = 0; i < people.size() - 1;i++){
            System.out.println(people.get(i).toString());
        }
        
    }

    public void ex2(){
        Person p1 = new Person(1,"John","Smith");
        Person p2 = new Person(2,"Mary","Jones");
        Person p3 = new Person(3,"Peter","Griffen");
        HashMap<Integer,Person> map = new HashMap<Integer,Person>();
        map.put(p1.getId(),p1);
        map.put(p2.getId(),p2);
        map.put(p3.getId(),p3);
        Scanner input = new Scanner(System.in);
        String id = "";
        do{
            System.out.print("Enter number: ");
            id= input.next();
            if(!id.equals("done")){
                String value = map.get(Integer.parseInt(id)).toString();
                System.out.println(value);
            }
        }
        while(!id.equals("done"));
    }

    public void ex3(){
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4(){
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5(){
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> history = Calculator.getHistory();
        String num1 = "";
        do{
            System.out.print("Enter first number: ");
            num1 = input.next();
            if(!num1.equals("done")){
                System.out.print("Enter second number: ");
                int num2 = input.nextInt();
                System.out.print("Enter operation (add,sub,mul,div): ");
                String choice = input.next();
                int res = 0;
                Calculator calc = new Calculator(Integer.parseInt(num1),num2);
                switch(choice){
                    case("add"):
                        res = calc.add();
                        System.out.println("Result: " + res);
                        break;
                    case("sub"):
                        res = calc.sub();
                        System.out.println("Result: " + res);
                        break;
                    case("mul"):
                        res = calc.mul();
                        System.out.println("Result: " + res);
                        break;
                    case("div"):
                        res = calc.div();
                        System.out.println("Result: " + res);
                        break;

                }
            }
        }
        while(!num1.equals("done"));
        for(int i = 0; i < history.size(); i++){
            System.out.println(history.get(i));
        }
    }

    public void ex7(){
        var personList = Arrays.asList(
        new Person(1, "Peter", "Jones"),
        new Person(2, "John", "Smith"),
        new Person(3, "Sue", "Anderson")
        );
        var newPersonList = personList.stream().map(p -> new Person(p.getId(),p.getFirstName(),"xxx")).collect(Collectors.toList());
        for (Person p : newPersonList) {
            System.out.println(p);
        }

    }

    public void ex8(){
        var personList = Arrays.asList(
        new Person(1, "Charlie", "Jones"),
        new Person(2, "Zoey", "Smith"),
        new Person(3, "Adam", "Anderson")
        );

        for(int i = 0; i < personList.size() - 1;i++){
            for(int j = personList.size() - 1; j> i;j--){
                if(personList.get(i).compareTo(personList.get(j))> 0){
                    Person temp = personList.get(j);
                    personList.set(j,personList.get(j-1));
                    personList.set(j-1,temp); 

                }

            }
        }
        
        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public void ex9(){
        var personList = Arrays.asList(
        new Person(1, "Charlie", "Jones"),
        new Person(2, "Zoey", "Smith"),
        new Person(3, "Adam", "Anderson")
        );
        var filteredList = personList.stream().filter(p -> p.getLastName() == "Smith").collect(Collectors.toList());
        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    public void ex10(){
        LinkedList<Cat> catList = Cat.getCatList();
        catList.add(new Cat("Alice"));
        catList.add(new Cat("Bob"));
        catList.add(new Cat("Charlie"));
        catList.add(new Cat("Dan"));
        while(!catList.isEmpty()){
            for (Cat cat : catList) {
                System.out.print(cat);
            }
            System.out.println();
            catList.remove();

        }
    }

}
