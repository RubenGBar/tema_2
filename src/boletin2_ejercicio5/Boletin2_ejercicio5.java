package boletin2_ejercicio5;

import java.util.Scanner;

public class Boletin2_ejercicio5 {
	public static void main(String[] args) {
	
		//Creo la variable donde guardo el la letra del carnet de conducir
		String letraCarnet;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido que introduzca su letra del carnet de conducir
		System.out.println("Introduzca la letra de su carnet de conducir: ");
		
		//Leo el valor de letraCarnet del teclado
		letraCarnet = sc.nextLine();
		
		//Creo el Switch para mostrar el tipo de carnet según la letra introducida
		switch (letraCarnet) {
		case "E" -> {//Si introduce E mostrará que su carnet es de remolques
			System.out.println("Su carnet es de remolques");
		}
		case "D" -> {//Si introduce D mostrará que su carnet es de autobuses
			System.out.println("Su carnet es de autobuses");
		}
		case "C1", "C2", "C3", "C4", "C5" -> {//Si introduce un valor entre C1 y C5 mostrará que su carnet es de camiones
			System.out.println("Su carnet es de camiones");
		}
		case "A" -> {//Si introduce A mostrará que su carnet es de motocicletas
			System.out.println("Su carnet es de motocicletas");
		}
		case "B1", "B2" -> {//Si introduce B1 o B2 mostrará que su carnet es de automóviles
			System.out.println("Su carnet es de automóviles");
		}
		default -> {
			System.out.println("El valor introducido es erróneo");
		}
		}
		//Cierro el Scanner
		sc.close();
	}
}
