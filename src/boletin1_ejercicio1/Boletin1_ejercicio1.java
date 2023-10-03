package boletin1_ejercicio1;

import java.util.Scanner;

public class Boletin1_ejercicio1 {
	public static void main(String[] args) {
		
		//Declaro las variables
		int num1;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca un numero
		System.out.println("Introduzca un número: ");
		
		//Leo el valor de num1 del teclado
		num1 = sc.nextInt();
		
		//Creo el condicional para compobar si es par o impar
		if (num1%2 == 0) {//Si es verdad aparecerá que el numero es par
			System.out.println("El número es par");
		}else {//Si es falso aparecerá que el número es impar
			System.out.println("El número es impar");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
