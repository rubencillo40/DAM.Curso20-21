import java.util.Scanner;
public class Ejer5_2 {

	public static void main(String args[])
	  {
	    String texto;
	    int contador = 0;
	    Scanner in = new Scanner(System.in);

	    System.out.println("Introduce un texto con parentesis:");
	    texto = in.nextLine();

	    int length = texto.length();

	    for (int i = 0; i < length ; i++) {
	    	char letter = texto.charAt(i);
	    	
	      if( letter == '(') {
	    	  contador++;
	      }
	      
	      if( letter == ')') {
	    	  contador--;
	      } 
	    }
	    
	    
	    if(contador == 0) {
	    	 System.out.println("Parentesis correctos");
	    }
	    else {
	    	System.out.println("Parentesis no correctos");
	    }
	  }
	}