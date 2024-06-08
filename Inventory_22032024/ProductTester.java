/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inventory_22032024;

/**
 *
 * @author LAB-MM
 */
public class ProductTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //6 object product
        //2 object mengacu pada default constructor
        product p1 = new product();
        product p2 = new product();
        //4 object mengacu pada constructor dengan parameter
        
        product p3 = new product(1,"Rinso 1.8 kg",10,48500.00);
        product p4 = new product(2,"Molto Cair 100 ml",25,15500.00);
        product p5 = new product(3,"Pepsodent",250,7500.00);
        product p6 = new product(4,"Lifebuoy 150 ml",35,20000.00); 
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
    
}
