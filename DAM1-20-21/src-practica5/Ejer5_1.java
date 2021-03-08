import java.util.Scanner;
public class Ejer5_1 {

	public static void main(String args[])
	  {
	    String original, reverse = "";
	    Scanner in = new Scanner(System.in);

	    System.out.println("Introduce un texto para invertirlo:");
	    original = in.nextLine();

	    int length = original.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      reverse = reverse + original.charAt(i);

	    System.out.println("Texto invertido: " + reverse);
	  }
	}