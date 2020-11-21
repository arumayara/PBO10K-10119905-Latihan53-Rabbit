/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan53.Rabbit;

/**
 *
 * @author
 * Nama  : Abraham Rumayara
 * KELAS : IF10K
 * NIM   : 10119905
 * Deskripsi Program : Program Rabbit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit objAnimal = new Rabbit("Peter",true, "grass", 4,"Grey");
        System.out.println("Hello, His name is "+objAnimal.getName());
        System.out.println(objAnimal.getName()+" is Vegetarian? "+objAnimal.isVegetarian());
        System.out.println(objAnimal.getName()+" eats "+objAnimal.getEats());
        System.out.println(objAnimal.getName()+" has "+objAnimal.getNoOfLegs()+ " legs.");
        
        
    }
    
}
