
package ArrayException24057;


public class FinallyDemo 
{
    public static void bagi(int n) throws Exception
    {
        try 
        {
            switch(n) 
            {
                case 1: System.out.println("case pertama");
                        return;
                case 3: System.out.println("case ketiga");
                        throw new RuntimeException("demo case ketiga");
                case 4: System.out.println("case keempat");
                        throw new Exception("demo casekeempat");
                case 2: System.out.println("case Kedua");
            }
        }catch (RuntimeException e) 
        {
            System.out.print("RuntimeException terjadi : ");
            System.out.println(e.getMessage());
        } finally 
        {
            System.out.println("try-block entered.");
        }

    }
    public static void main(String[] args) 
    {
        for(int i=1;i<=4;i++)
        {
            try
            {
                FinallyDemo.bagi(i);
            }catch(Exception e)
            {
                System.out.print("Exception Terjadi : ");
                System.out.print(e.getMessage());
            }
            System.out.println();
        }
    }
    
}
