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
public class Rabbit extends Animal {
    
    private final String color;
    private final String name;

    public Rabbit( String name, boolean vegetarian, String food, int legs, String color) {
        super(vegetarian, food, legs);
        this.color = color;
        this.name = name;
    }
    
    
    
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
    
    
}
