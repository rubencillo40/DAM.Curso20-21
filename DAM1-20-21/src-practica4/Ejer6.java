
public class Ejer6 {

	public static void contarIntConsecutivos(int[] patron) {
		
		for(int i = 1; patron.length > i; i++) {
			
			System.out.print("check");
			
			if(patron[i] < i) {
				break;
			}
			System.out.print(i);
		}
	}
	
	public static void main(String[] args) {
	
		int[] valor = {1, 2, 3, 4 };
		
		contarIntConsecutivos(valor);
		
	}
	}