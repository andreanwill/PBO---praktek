
package ArrayException24057;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ArrayExceptionExample 
{

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        try
        {
        System.out.print("Masukan ukuran array = ");
        int uk = input.nextInt(); //deklarasi array
        
        int[] nilai = new int [uk];
        for(int i=0;i<uk;i++)
        {
            System.out.print("Nilai array indeks ke "+i+" = ");
            nilai[i] = input.nextInt();
        }
        System.out.print("Nilai array yang akan ditampilkan = ");
        int index = input.nextInt();
        
        System.out.print("nilai indeks ke "+index+" = "+nilai[index]);
        }catch(InputMismatchException e)
        {
            System.out.println("Data input tidak sesuai dengan tipe");
        }catch(NegativeArraySizeException e)
        {
            System.out.println("Ukuran array tidak boleh negatif");
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Angka yang dimasukan array berlebih");
        }catch(Exception e)
        {
            System.out.println("Pengecualian lain"+e);
        }finally
        {
            System.out.println("Blok exception");
        }
    }
    
}
