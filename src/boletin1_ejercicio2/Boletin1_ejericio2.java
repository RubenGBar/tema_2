package boletin1_ejercicio2;

import java.util.Scanner;

public class Boletin1_ejericio2 {
	public static void main(String[] args) {
		
		//Declaro las variables
		int num1, num2;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca un numero
		System.out.println("Introduzca un número: ");
		
		//Leo el valor de num1 del teclado
		num1 = sc.nextInt();
		
		//Le pido que introduzca un numero
		System.out.println("Introduzca un número: ");
				
		//Leo el valor de num2 del teclado
		num2 = sc.nextInt();
		
		//Creo el condicional para comparar los números
		if (num1 == num2) {//Si es verdad aparecerá que los números son iguales
			System.out.println("Los números son iguales");
		}else {//Si es falso aparecerá que los números son distintos
			System.out.println("Los números son diferentes");
		}
		//Cierro el Scanner
		sc.close();
	}

}
