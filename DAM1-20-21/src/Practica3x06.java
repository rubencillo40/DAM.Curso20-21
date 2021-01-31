// Multiplo1.java
// Fecha: 14/10/2013
// Autor/a:.......
// Escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.

import java.util.Scanner;
public class Practica3x06 	{

	static byte requestTable() {
		System.out.print("Indique la tabla de multiplicar: ");
		
		Scanner teclado = new Scanner(System.in);
		byte t = teclado.nextByte();
		teclado.close();
		return t;
	}

	public static void calcularMostrarTabla(byte t) {

		System.out.println("\n\nTabla del "+t + "\n\n-------------------------\n\n"+
				0 +" x " +t+" = "+0 + "\n"+
				1 +" x " +t+" = "+1*t + "\n"+
				2 +" x " +t+" = "+2*t + "\n"+
				3 +" x " +t+" = "+3*t + "\n"+
				4 +" x " +t+" = "+4*t + "\n"+
				5 +" x " +t+" = "+5*t + "\n"+
				6 +" x " +t+" = "+6*t + "\n"+
				7 +" x " +t+" = "+7*t + "\n"+
				8 +" x " +t+" = "+8*t + "\n"+
				9 +" x " +t+" = "+9*t + "\n"+
				10 +" x " +t+" = "+10*t + "\n");
	}


	public static void main(String[] args) {

			calcularMostrarTabla(requestTable());
		}
	}