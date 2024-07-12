/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractRelation;

/**
 *
 * @author LAB-MM
 */
public class Circle extends Shape
{
    private double radius;
    
    public Circle()
    {
    }
    
     public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    @Override
    public String getName() {
        return "Circle";
    }
    @Override
    public double getArea() 
    {
        return Math.PI * radius * radius;
    }
}
