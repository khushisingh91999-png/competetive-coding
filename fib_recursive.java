import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib = Fibonacci(n);
    }
    
    public static int Fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}