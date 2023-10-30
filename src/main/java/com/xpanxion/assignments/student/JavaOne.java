package com.xpanxion.assignments.student;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;
public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        name = name.toUpperCase();
        System.out.println("Your name in upper case is " + name);
    }

    public void ex2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = input.nextLine();
        int count = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(Character.isUpperCase(sentence.charAt(i))){
                count++;
            }
        }
        System.out.println("Number of uppercase letters: " + count);
    }

    public void ex3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.nextLine();
        String cap = "";
        String[] sen = word.split(" ");
        for(int i = 0; i < sen.length; i++){
            if(i % 2 == 0){
                sen[i] = sen[i].toUpperCase();
            }
            cap += " " + sen[i];

        }
        System.out.println(cap);
    }

    public void ex4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.next();
        String rev = "";
        for(int i = word.length()-1; i >= 0; i--){
            rev += word.charAt(i);  
        }
        System.out.println(rev);
        System.out.println(word);
        if(word.equals(rev)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public void ex5() {
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int vCount = 0;
        int cCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.nextLine();
        for(int i = 0; i < word.length(); i++){
            if(vowels.contains(word.toLowerCase().charAt(i))){
                vCount++;
            }
            else{
                cCount++;
                if(word.toLowerCase().charAt(i) == ' '){
                    cCount--;
                }
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants " + cCount);
    }

    public void ex6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Result: " + sum);
    }

    public void ex7() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
         System.out.print("Enter operation (add,sub,mul,div): ");
        String choice = input.next();
        switch(choice){
            case("add"):
                int sum = num1 + num2;
                System.out.println("Result: " + sum);
                break;
            case("sub"):
                int sub = num1 - num2;
                System.out.println("Result: " + sub);
                break;
            case("mul"):
                int mul = num1 * num2;
                System.out.println("Result: " + mul);
                break;
            case("div"):
                if(num1 != 0 || num2 != 0){
                    int div = num1 / num2;
                    System.out.println("Result: " + div);
                    break;
                }
                else{
                    System.out.println("Divide by 0 error, try again");
                    break;
                }
        }
    }

    public void ex8() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price per square feet: ");
        double price = input.nextDouble();
        input.nextLine();
        // System.out.print("Enter room dimensions (width x length): ");
        String dim ="";
        int area = 1;
        int totSum = 0;
        double totPrice = 0.0;
        // System.out.println("Enter room dimensions (width x length): ");
        // dim = input.nextLine();
        // System.out.print("Enter room dimensions (width x length): ");
        // System.out.println("Enter room dimensions (width x length): ");
        while(!dim.equals("done")){
            System.out.print("Enter room dimensions (width x length): ");
            dim = input.nextLine();
            String[] vals = dim.split(" ");
            for(int i = 0; i < vals.length; i++){
                // System.out.println(vals[i]);
                if(!vals[i].equals("x") && !vals[i].equals("done")){
                    int dims = Integer.parseInt(vals[i]);
                    area *= dims;
                    // System.out.println(area);
                }
            }
            totSum += area;
            // System.out.println(totSum);
            area = 1;
            totPrice =(totSum-1) * price;
        }
        System.out.println("Total Cost: $ " + totPrice);
        
       
        // int width = Integer.parseInt(dim[0]);
        // int length = Integer.parseInt(dim[1]);
        // double tc = (length*width) * price;
        // System.out.println("Total cost: $" + tc);
        }

    public void ex9() {
        Random random = new Random();
        int num = random.nextInt(1,6);
        System.out.println(num);
        Scanner input = new Scanner(System.in);
        int guess = 0;
        do{
            System.out.print("Enter a number: ");
            guess = input.nextInt();
            if((guess > num) || (guess < num)){
                System.out.println("Try again...");
            }
        }
        while(guess != num);
        System.out.println("You got it!!!");
    }

    public void ex10() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String[] words = input.nextLine().split(" ");
        String blanks = "";
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                blanks += " ";
                System.out.println(blanks + words[i].charAt(j));
            }
            blanks = "";
        }
        // System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
