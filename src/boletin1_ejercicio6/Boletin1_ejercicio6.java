package boletin1_ejercicio6;

import java.util.Scanner;

public class Boletin1_ejercicio6 {
	public static void main(String[] args) {
		
		//Declaro las variables donde se almacenarán los númros de la ecuación
		double a, b, c, x1, x2, x3;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le aviso de lo que vamos a hacer
		System.out.println("Vamos a calcular el valor de x con una ecuación de segundo grado del tipo a*x^2+b*x+c");
		
		//Le pido el valor de a
		System.out.println("Introduce el valor de a: ");
		
		//Leo el valor de a del teclado
		a = sc.nextDouble();
		
		//Le pido el valor de b
		System.out.println("Introduce el valor de b: ");
		
		//Leo el valor de b del teclado
		b = sc.nextDouble();
		
		//Le pido el valor de c
		System.out.println("Introduce el valor de c: ");
		
		//Leo el valor de c del teclado
		c = sc.nextDouble();
		
		//Calculo lo que hay dentro de la raíz para ver si es un número negativo
		x1 = (Math.pow(b, 2) - 4*a*c);
		
		if (x1 <= 0) {//Compruebo si el el número es negatiov, si lo es mostrará un mensaje de error
			System.out.println("La operación no tiene una solución real");
		}else if (a == 0) {//Compruebo si la a vale 0, si es así resuelvo como una ecuación de primer grado
			x2 = (-c/b);
			System.out.println("El valor de x es igual a " + x2);
		}else {//Calculo de la ecuación de segundo grado e impresión de los resultados
			x2 = ( (-b + Math.sqrt(x1)) / (2*a) );
			x3 = ( (-b - Math.sqrt(x1)) / (2*a) );
			System.out.println("Los valores de la x son " + x2 + " y " + x3);
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
