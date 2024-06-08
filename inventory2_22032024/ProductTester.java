
package Inventory2_22032024;

import java.util.Scanner;


public class ProductTester 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        //Local vatriabel
        int tempNumber;
        String tempName;
        int tempQuantitystock;
        double tempPrice;
        
        System.out.print("Masukan Kode Produk = ");
        tempNumber=in.nextInt();
        in.nextLine();
        System.out.print("Masukan Nama Produk = ");
        tempName=in.nextLine();
        System.out.print("Masukan Jumlah Produk = ");
        tempQuantitystock=in.nextInt();
        System.out.print("Masukan Harga Produk = ");
        tempPrice=in.nextDouble();
        product p1 = new product (tempNumber,tempName,tempQuantitystock,tempPrice);
        
        System.out.print("Masukan Kode Produk = ");
        tempNumber=in.nextInt();
        in.nextLine();
        System.out.print("Masukan Nama Produk = ");
        tempName=in.nextLine();
        System.out.print("Masukan Jumlah Produk = ");
        tempQuantitystock=in.nextInt();
        System.out.print("Masukan Harga Produk = ");
        tempPrice=in.nextDouble();
        product p2 = new product (tempNumber,tempName,tempQuantitystock,tempPrice);
        
        in.close();
        
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
