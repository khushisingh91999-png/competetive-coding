import java.util.*;
class firstprog
{
    public static void main(String args[])
    {
        {
            ArrayList <Integer> arr = new ArrayList < > ();
            Scanner Sc = new Scanner (System.in);
            int n = Sc.nextInt();
            for (int i=0;i<n;i++)
            {
                arr.add(Sc.nextInt());
            }
            int Total = sum(arr);
            {
                System.out.println(Total);
            }           
        }
    }
}