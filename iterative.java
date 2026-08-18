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

    //Iterative method;
	public static int power(int base , int exp){  
	    int power = 1;
	    
	    for(int i=1;i<=exp;i++){
	        power = power * base;
	    }
	    
	    return power;
	}


}
