/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan53.Rabbit;

/**
 *
 * @author aruma
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOflegs;

    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOflegs = legs;
    }

    
    public boolean isVegetarian(){
        return vegetarian = false;
    }
    
    public String getEats(){
        return eats;
    }
    
    public int getNoOfLegs(){
        return noOflegs;
    }
    
    
    
}
