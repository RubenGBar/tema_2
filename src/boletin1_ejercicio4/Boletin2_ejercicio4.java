package boletin1_ejercicio4;

import java.util.Scanner;

public class Boletin2_ejercicio4 {
	public static void main(String[] args) {
		
		//Declaro las variables donde almaceno los números a ordenar
		double num1, num2;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca el primer número
		System.out.println("Introduzca un número: ");
		
		//Leo el valor de num1 por el teclado
		num1 = sc.nextDouble();
		
		//Le pido que introduzca el segundo número
		System.out.println("Introduzca un número: ");
				
		//Leo el valor de num2 por el teclado
		num2 = sc.nextDouble();
		
		//Comparo los números para ver cual es mayor 
		if (num1 == num2) {
			System.out.println("Los números son iguales");
		} else if (num1 > num2) {//Si es verdad se muestra num2 primero y num1 segundo
			System.out.println("Los números ordenados de menor a mayor son " + num2 + " y " + num1);
		}else {//Si es falso se muestra num1 primero y num2 segundo
			System.out.println("Los números ordenados de menor a mayor son " + num1 + " y " + num2);
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
