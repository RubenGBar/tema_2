package boletin1_ejercicio3;

import java.util.Scanner;

public class Boletin1_ejercicio3 {
	public static void main(String[] args) {
		
		//Declaro las variables donde recogueré los númeos introducidos por el usuario
		double num1;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca un número
		System.out.println("Introduzca un númeo: ");
		
		//Le el valor de num1 del teclado
		num1 = sc.nextDouble();
		
		//Creo el Condicional
		if (num1 < 1 && num1 > -1 && num1 != 0) {/* Compruebo a la vez si el número es menor que 1
		mayor que -1 y distinto de 0 y si es verdad entonces el número es un casi cero*/
			System.out.println("El número es un casi-cero");
		}else {//Si el número no cumple las condiciones anteriores entonces no es un casi-cero
			System.out.println("Elnúmero no es un casi-cero");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
