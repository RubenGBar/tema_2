package boletin2_ejercicio2;

import java.util.Scanner;

public class Boletin2_ejercicio2 {
	public static void main(String[] args) {
		
		//declaro las variables donde almacenaré los números de los días de la semana
		int dia;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca un número
		System.out.println("Introduzca un número: ");
		
		//Leo el valor de dia del teclado
		dia = sc.nextInt();
		
		//Muestro el día de la semana según el valor del switch
		System.out.print("El día de la semana es ");
		
		/*Creo el condicional de tipo switch con el que evaluaré que días de la semana se imprimirá por
		pantalla según el valor númerico introducido*/
		switch (dia) {
		case 1 ->{//Si se cumple la condición se muestra el mensaje Lunes
			System.out.println("Lunes");
		}
		case 2 -> {//Si se cumple la condición se muestra el mensaje Martes
			System.out.println("Martes");
		}
		case 3 -> {//Si se cumple la condición se muestra el mensaje Miércoles
			System.out.println("Miercóles");
		}
		case 4 -> {//Si se cumple la condición se muestra el mensaje Jueves
			System.out.println("Jueves");
		}
		case 5 -> {//Si se cumple la condición se muestra el mensaje Viernes
			System.out.println("Viernes");
		}
		case 6 -> {//Si se cumple la condición se muestra el mensaje Sábado
			System.out.println("Sábado");
		}
		case 7 -> {//Si se cumple la condición se muestra el mensaje Domingo
			System.out.println("Domingo");
		}
		default -> {//Si se cumple la condición se muestra el mensaje Error
			System.out.println("ERROR");
		}
		}
		//Cierro el Scanner
		sc.close();
	}

}
