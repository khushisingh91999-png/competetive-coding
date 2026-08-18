import java.util.*;
class firstprog
{
    public static void main(String args[])
    {
        {
            Scanner Sc = new Scanner (System.in);
            int n = Sc.nextInt();
            int Total = Factorial(n);
            {
                System.out.println(Total);
            }
            Public Static.int Factorial(int n);
            {
                int Total = 1;
                for(int i=1;i<=n;i++)
                {
                    Total *= i;
                }
                return Total;
            
            }
            
            
        }
    }
}