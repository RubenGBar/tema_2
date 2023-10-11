package boletin2_ejercicio4;

import java.util.Scanner;

public class Boletin2_ejercicio4 {
	public static void main(String[] args) {
		
		//Declaro las variables donde almacenaré el valor las tiradas
		 String tirada1, tirada2;
		 
		 //Declaro las variables donde guardo el número que se le asignará a cada tirada y las inicializo para después poder sumarlas
		 int tirada1_num1 = 0, tirada2_num2 = 0;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introduzca el valor de la primera tirada
		System.out.println("Introduzca el valor de su primera tirada: ");
		
		//Leo el valor de tirada1 del teclado
		tirada1 = sc.nextLine();
		
		//Creo el switch para asignar un valor númerico a las tiradas
		switch (tirada1) {
		case "UNO" -> {//Si se introduce UNO le asigno el valor númerico 1 a una nueva variable
			tirada1_num1 = 1;
		}
		case "DOS" -> {//Si se introduce DOS le asigno el valor númerico 2 a una nueva variable
			tirada1_num1 = 2;
		}
		case "TRES" -> {//Si se introduce TRES le asigno el valor númerico 3 a una nueva variable
			tirada1_num1 = 3;
		}
		case "CUATRO" -> {//Si se introduce CUATRO le asigno el valor númerico 4 a una nueva variable
			tirada1_num1 = 4;
		}
		case "CINCO" -> {//Si se introduce CINCO le asigno el valor númerico 5 a una nueva variable
			tirada1_num1 = 5;
		}
		case "SEIS" -> {//Si se introduce SEIS le asigno el valor númerico 6 a una nueva variable
			tirada1_num1 = 6;
		}
		default -> {//Si se introduce otro valor doy un mensaje de eeror y termino de ejecutar el programa
			System.out.println("El valor introducido es erróneo");
			System.exit(0);
		}
		}
		
		//Le pido al usuario que introduzca el valor de la segunda tirada
		System.out.println("Introduzca el valor de su segunda tirada: ");
		
		//Leo el valor de tirada2 del teclado
		tirada2 = sc.nextLine();
		
		//Creo el switch para asignar un valor númerico a las tiradas
		switch (tirada2) {
		case "UNO" -> {//Si se introduce UNO le asigno el valor númerico 1 a una nueva variable
			tirada2_num2 = 1;
		}
		case "DOS" -> {//Si se introduce DOS le asigno el valor númerico 2 a una nueva variable
			tirada2_num2 = 2;
		}
		case "TRES" -> {//Si se introduce TRES le asigno el valor númerico 3 a una nueva variable
			tirada2_num2 = 3;
		}
		case "CUATRO" -> {//Si se introduce CUATRO le asigno el valor númerico 4 a una nueva variable
			tirada2_num2 = 4;
		}
		case "CINCO" -> {//Si se introduce CINCO le asigno el valor númerico 5 a una nueva variable
			tirada2_num2 = 5;
		}
		case "SEIS" -> {//Si se introduce SEIS le asigno el valor númerico 6 a una nueva variable
			tirada2_num2 = 6;
		}
		default -> {//Si se introduce otro valor doy un mensaje de eeror y termino de ejecutar el programa
			System.out.println("El valor introducido es erróneo");
			System.exit(0);
		}
		}
		
		//Sumo el resultado de las tiradas y lo muestro por pantalla
		System.out.println("La suma de sus tiradas es: " + (tirada1_num1+tirada2_num2));
		
		//Cierro el Scanner
		sc.close();
	}
}
