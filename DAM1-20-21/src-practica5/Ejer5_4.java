import java.util.Scanner;
public class Ejer5_4 {

	public static void main(String args[])
	  {
	    String texto = "Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se est� muy apretado. As� que estamos leyendo todo el d�a. Vamos a salir en 5 d�as";
	    texto = texto.toLowerCase();
	    
	    int length = texto.length();
	    int i=0;
	    int indice = texto.indexOf(" en ", i);
	    int contador = 0;

	   
	    
	    do {
	    	i = indice + 2;
	    	indice = texto.indexOf("en", i);
	    	
	    	contador++;
	    	
//	    	System.out.println("i: " + i);
//	    	System.out.println("Contador: " + contador);
	    	}
	    while(indice != -1);

	    System.out.println("Contador: " + contador);
	    
	  }
	}