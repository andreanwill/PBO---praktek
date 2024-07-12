/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AbstractRelation;

/**
 *
 * @author LAB-MM
 */
public class AbstractExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Square square = new Square();
        square.setSisi(20);
        System.out.println("Name    :"+square.getName());
        System.out.println("Area    :"+square.getArea   ());
        
        Circle circle = new Circle();
        circle.setRadius(20);
        System.out.println("Name    :"+circle.getName());
        System.out.println("Area    :"+circle.getArea   ());
    }
    
}
