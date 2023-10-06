package boletin1_ejercicio10;

import java.util.Scanner;

public class Boletin1_ejercicio10 {
	public static void main(String[] args) {
		
		//Declaro las variables donde se almacenan los números 
		double num1, num2, num3;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca el primer número
		System.out.println("Introduzca un número: ");
		
		//Leo el valor de num1 del teclado
		num1 = sc.nextDouble();
		
		//Le pido que introduzca el segundo número
		System.out.println("Introduzca un número: ");
		
		//Leo el valor de num2 del teclado
		num2 = sc.nextDouble();
		
		//Le pido que introduzca el tercer número
		System.out.println("Introduzca un número: ");
		
		//Leo el valor de num3 del teclado
		num3 = sc.nextDouble();
		
		//Creo el condicional
		if (num1 + num2 == num3) {//Si se cumple la condición muestra que el tercer número es suma de los otros dos
			System.out.println("El número " + num3 + " es la suma de " + num1 + " y de " + num2);
		}else if (num3 + num1 == num2) {//Si se cumple la condición muestra que el segundo número es suma de los otros dos
			System.out.println("El número " + num2 + " es la suma de " + num3 + " y de " + num1);
		}else if (num3 + num2 == num1) {//Si se cumple la condición muestra que el primerer número es suma de los otros dos
			System.out.println("El número " + num1 + " es la suma de " + num3 + " y de " + num2);
		}else {//Si se cumple la condición muestra que nigún número es suma de los otros dos
			System.out.println("Ningún número es suma de otro");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
