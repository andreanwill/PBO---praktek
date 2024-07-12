/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorfisExample;

/**
 *
 * @author Lab-J2-01
 */
public class Student extends Person
{
    public Student()
    {
        super("Ali","Padang");
        //super.name = "Ali";
        System.out.println("Student:Constructor");
        //beberapa kode disini
    }
    
    @Override
    public String getName()
    {
        System.out.println("Student:getName");
        return name;
    }
    //beberapa kode disini
}
