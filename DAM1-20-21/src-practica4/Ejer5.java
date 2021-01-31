
public class Ejer5 {

	public static void compararVectoresChar(char[] caracteresP, char[] caracteresS) {
		
		if (caracteresP[0] != caracteresS[0]) { //si no son iguales
			
			if(caracteresP[0] > caracteresS[0]) { //si el primero es mayor
				System.out.println("1");
			}
				else {System.out.println("-1");} 
			
		} else {//son iguales}
		
		System.out.println ("0");
		
	}
	}
	
	public static void main(String[] args) {
	
		char[] caracteres1 = {'a','a'};
		
		char[] caracteres2 = {'a','a'};
		
		compararVectoresChar(caracteres1, caracteres2);
		
	}
	}