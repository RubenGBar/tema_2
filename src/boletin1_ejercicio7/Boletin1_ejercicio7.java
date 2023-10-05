package boletin1_ejercicio7;

import java.util.Scanner;

public class Boletin1_ejercicio7 {
	public static void main(String[] args) {
		
		//Declaro la variable donde almaceno los números a contar sus cifras
		double num1;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pidom que introduzca el número a contar
		System.out.println("Introduzca un número: ");
		
		//Leo el valor del número del teclado
		num1 = sc.nextDouble();
		
		//Creo el condicional para que repropduzca un mensaje específico según el número de cifras
		if (num1 < 0) {//Si introduce un número menor que 0 aparece un mensaje de error
			System.out.println("El número introducido es incorrecto");
		}else if (num1 < 10) { //Si el número es menor que 10 imprime que el número tiene  cifra
			System.out.println("El número tiene 1 cifra");
		}else if (num1 < 100) {//Si el número es menor que 100 imprime que el número tiene 2 cifras
			System.out.println("El número tiene 2 cifras");
		}else if (num1 < 1000) {//Si el número es menor que 1000 imprime que el número tiene 3 cifras
			System.out.println("El número tiene 3 cifras");
		}else if (num1 < 10000) {//Si el número es menor que 10000 imprime que el número tiene 4 cifras
			System.out.println("El número tiene 4 cifras");
		}else if (num1 < 100000) {//Si el número es menor que 100000 imprime que el número tiene 5 cifras
			System.out.println("El número tiene 5 cifras");
		}else {//Si el número es mayor que 100000 imprime que el número tiene más de 5 cifras
			System.out.println("El número tiene más de 5 cifras");
		}
		//Cierro el Scanner
		sc.close();
	}

}
