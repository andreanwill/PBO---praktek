
package ArrayException24057;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DivByZero 
{

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.print("nilai yang akan dibagi = ");
            int nilai1 = input.nextInt();
            System.out.print("nilai pembagi = ");
            int nilai2 = input.nextInt();
            int result = (nilai1/nilai2);
            System.out.println("Hasil = "+result);
        }catch(ArithmeticException e)
        {
            System.out.println("Pesan Error : "+e);
        }catch(InputMismatchException e)
        {
            System.out.println("Nilai yang anda inputkan salah");
        }catch(Exception e)
        {
            System.out.println("Pengecualian lain"+e);
        }finally
        {
            System.out.println("Program Exception Berakhir");
        }
    }
    
}
