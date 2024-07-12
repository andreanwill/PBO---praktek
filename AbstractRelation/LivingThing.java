/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractRelation;

/**
 *
 * @author LAB-MM
 */
public abstract class LivingThing 
{
    public void breath()
    {
        System.out.println("Living Thing Breathing...");
    }
    public void eat()
    {
        System.out.println("Living Thing eating...");
    }
    
    public abstract void walk();
}
