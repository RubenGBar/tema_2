package boletin2_ejercicio1;

import java.util.Scanner;

public class Boletin2_ejercicio1 {
	public static void main(String[] args) {
		
		//Creo la variable donde almaceno la nota
		int nota;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pido que introduzca su nota
		System.out.println("Introduzca su nota: ");
		
		//Leo la nota del teclado
		nota = sc.nextInt();
		
		//Creo esto fuera del switch para evitar redundancias
		System.out.print("Su nota es un ");
		
		//Creo el Switch para mostrar mensajes según el valor introducido
		switch (nota) {
		
		case 0, 1, 2, 3, 4 -> {//Si se cumple la condición se muestra el mensaje insuficiente
			System.out.println("insuficiente");
		}
		
		case 5 -> {//Si se cumple la condición se muestra el mensaje suficiente
			System.out.println("suficiente");
		}
		
		case 6 -> {//Si se cumple la condición se muestra el mensaje bien
			System.out.println("bien");
		}
		
		case 7, 8 -> {//Si se cumple la condición se muestra el mensaje notable
			System.out.println("notable");
		}
		
		case 9, 10 -> {//Si se cumple la condición se muestra el mensaje sobresaliente
			System.out.println("sobresaliente");
		}
		
		default -> {//Si el valor es mayor que 10 o menor que 0 da un error
			System.out.println("valor inválido");
		}
		
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
