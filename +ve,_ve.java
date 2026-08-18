import java.util.*;
class firstprog
{
    public static void main(String args[])
    {
        int X = 5;
        if(X>0)
        {
            System.out.println("Positive");X++;   
        }
        else
        {
            System.out.println("Negative");
        }
        for(int i=0;i<X;i++)
        {
            System.out.println(i);
        }
    }
}