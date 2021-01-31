
public class Ejer3 {

	public static void frecuenciaNumero(int[] vector, int entero) {
		
		int frecuencia = 0;
		
		for(int i = 0; vector.length > i; i++) {
			
			if (entero == vector[i]) {
				frecuencia++;
			}
			
		}
		
		System.out.println ("La frecuencia es: " + frecuencia);
		
	}
	
	public static void main(String[] args) {
	
		int[] numeros = {3, 2, 5, 5, 3, 7, 3};
		
		int numero = 3;
		
		frecuenciaNumero(numeros, numero);
		
	}
	}