/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PolimorfisExample;

/**
 *
 * @author Lab-J2-01
 */
public class PolimorfisExample {

    public static void printInformation( Person P )
    {
        System.out.println("Nama    :"+P.getName());
        System.out.println("Nama    :"+P.getAddress());
        
    }
    
    public static void main(String[] args) {
        // Person ref; 
        Student studentObject = new Student();
        studentObject.setName("Ali");
        studentObject.setAddress("Padang");
        Employee employeeObject = new Employee();
        employeeObject.setName("Deni");
        employeeObject.setAddress("Padang Panjang");
        
        /*
        ref = studentObject;
        System.out.println("Nama    :"+ref.getName());
        System.out.println("Alamat  :"+ref.getAddress());
        
        ref = employeeObject;
        System.out.println("Nama    :"+ref.getName());
        System.out.println("Alamat  :"+ref.getAddress());
        */
        
        printInformation(studentObject);
        printInformation(employeeObject);   
    }
    
}
