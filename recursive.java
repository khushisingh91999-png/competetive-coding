import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int base = sc.nextInt();
	    int exp = sc.nextInt();
	    int power = power(base, exp);
	    
		System.out.println("Power of " + base + " IS = " + power);
	}
	//Recursive method:
	public static int power(int base , int exp){
	    if(exp<=0) return 1;
	    
	    return base * power(base, exp - 1);
	}