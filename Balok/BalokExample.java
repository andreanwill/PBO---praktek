/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Balok;

import java.util.Scanner;

/**
 *
 * @author Lab-J2-01
 */
public class BalokExample 
{

    public static void main(String[] args) 
    {   
        Scanner in = new Scanner(System.in);
        
        System.out.print("Panjang :");
        int panjang = in.nextInt();
        System.out.print("Lebar :");
        int lebar = in.nextInt();
        System.out.print("Tinggi :");
        int tinggi = in.nextInt();
        
         Balok balok1 = new Balok(panjang,lebar,tinggi);
         
         int v;
         v = balok1.getVolume();
         System.out.println("Volume dengan method 1 = "+v);
         
         int luasalas = balok1.getPanjang() * balok1.getLebar();
         
         int v2;
         v2 = balok1.getVolume(luasalas,tinggi);
         System.out.println("Volume dengan method 2 = "+v2);
         
         int lp = balok1.luaspermukaan();
         System.out.println("Luas permukaan = "+lp);
    }
    
}
