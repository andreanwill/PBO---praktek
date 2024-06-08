/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Balok;

/**
 *
 * @author Lab-J2-01
 */
public class Balok 
{
    private int panjang;
    private int lebar;
    private int tinggi;
    
    public Balok()
    {
        
    }
    public Balok(int apanjang, int alebar, int atinggi)
    {
        this.panjang = apanjang;
        this.lebar = alebar;
        this.tinggi = atinggi;
    }
    
    public int getPanjang()
    {
        return panjang;
    }
    public void setPanjang(int panjang)
    {
        this.panjang = panjang;
    }
    
    public int getLebar()
    {
        return lebar;
    }
    public void setLebar(int lebar)
    {
        this.lebar = lebar;
    }
    
    public int getTinggi()
    {
        return tinggi;
    }
    public void setTinggi(int tinggi)
    {
        this.tinggi = tinggi;
    }
    
    public int getVolume()
    {
        return panjang * lebar * tinggi;
    }
    public int getVolume(int luas, int tinggi)
    {
        return luas*tinggi;
    }
    
    public int luaspermukaan()
    {
        return 2 * ((panjang*lebar)+(panjang*tinggi)+(tinggi*lebar));
    }

}
