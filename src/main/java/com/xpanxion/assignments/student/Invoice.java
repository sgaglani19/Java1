package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Invoice extends Base {
    
    private ArrayList<Product> products = new ArrayList<>();

    public Invoice(int id){
        super(id);
    }

    public void addProduct(Product p){
        products.add(p);
    }
    public double getTotalCost(){
        double totalCost = 0.00;
        for(int i = 0; i < products.size(); i++){
            totalCost += products.get(i).getCost();
        }
        return totalCost;
    }
    public int getId(){
        return id;
    }
    
}
