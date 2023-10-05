package boletin1_ejercicio8;

import java.util.Scanner;

public class Boletin1_ejercicio8 {
	public static void main(String[] args) {
		
		//Declaro la varibale donde se almacenará la nota
		double num1;
		
		//Creo el Scanner 
		Scanner sc= new Scanner(System.in);
		
		//Le pido que introduzca su nota
		System.out.println("Introduzca su nota: ");
		
		//Leo el valor de la nota del teclado
		num1 = sc.nextDouble();
		
		//Creo el condicional para mostrar distintos mensajes según el valor de su nota
		if (num1 < 0) {//Si el valor introducido es menor que 0 se imprime un mensaje de error
			System.out.println("El valor introducido es incorrecto");
		}else if (num1 >= 0 && num1 < 5) {//Si el valor introducio está entre 0 y 5 la nota es insuficiente
			System.out.println("Usted tiene un insuficiente");
		}else if (num1 >= 5 && num1 <6) {//Si el valor introducio está entre 5 y 6 la nota es suficiente
			System.out.println("Usted tiene un suficiente");
		}else if (num1 >= 6 && num1 <7) {//Si el valor introducio está entre 6 y 7 la nota es un bien
			System.out.println("Usted tiene un bien");
		}else if (num1 >= 7 && num1 < 9) {//Si el valor introducio está entre 7 y 9 la nota es un notable
			System.out.println("Usted tiene un notable");
		}else if (num1 >= 9 && num1 <=10) {//Si el valor introducio está entre 9 y 10 la nota es un sobresaliente
			System.out.println("Usted tiene un sobresaliente");
		}else {//Si el valor introducido es mayor que 10 se imprime un mensaje de error
			System.out.println("El valor introducido es incorrecto");
		}
		//Cierro el Scanner
		sc.close();
	}

}
