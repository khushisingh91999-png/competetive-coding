importjava.util.*;
public class Main
{
	public static void main(String[] args) {
	    //public class ReverseString {
        String str = "Hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);

	}
}