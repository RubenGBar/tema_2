package boletin1_ejercicio5;

import java.util.Scanner;

public class Boletin1_ejercicio5 {
	public static void main(String[] args) {
		
		//Declaro las variables done almaceno los númeeros a ordenar
		double num1, num2, num3;
		
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
		
		//Le pido que introduzca el tercer número
		System.out.println("Introduzca un número: ");
								
		//Leo el valor de num3 por el teclado
		num3 = sc.nextDouble();
		
		//Pongo esto fuera del if para evitar redundancia
		System.out.print("Los números ordenados de mayor a menor son ");
		
		//Comparo los número y según se cumpaln las condiciones se imprimirá en un orden u otro
		if (num1 >= num2 && num2 >= num3) {
			System.out.print( + num1 + ", " + num2 + " y " + num3);
		}else if (num1 >= num3 && num3 >= num2) {
			System.out.print( + num1 + ", " + num3 + " y " + num2);
		}else if (num2 >= num1 && num1 >= num3) {
			System.out.print( + num2 + ", " + num1 + " y " + num3);
		}else if (num2 >= num3 && num3 >= num1) {
			System.out.print( + num2 + ", " + num3 + " y " + num1);
		}else if (num3 >= num2 && num2 >= num1) {
			System.out.print( + num3 + ", " + num2 + " y " + num1);
		}else {
			System.out.print( + num3 + ", " + num1 + " y " + num2);
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
