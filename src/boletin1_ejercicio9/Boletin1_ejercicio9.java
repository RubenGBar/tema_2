package boletin1_ejercicio9;

import java.util.Scanner;

public class Boletin1_ejercicio9 {
	public static void main(String[] args) {
		
		//Declaro las variables donde guardo la elección de los jugadores
		String jugador1, jugador2;
		
		//Creo el Scanner
		Scanner sc = new Scanner (System.in);
		
		//Muestro un mensaje de aviso para que introduzca PIEDRA, PAPEL, TIJERA
		
		//Le pido al jugador1 que introduzca su jugada
		System.out.println("Jugador 1 introduzca tu jagada:");
		
		//Leo el valor de jugador1 del teclado
		jugador1 = sc.nextLine();
		
		//Separo las entradas para que los jugadores no vean la jugada del otro jugador
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		
		//Le pido al jugador2 que introduzca su jugada
		System.out.println("Jugador 2 intrduzca su jugada:");
		
		//Leo el valor de jugador2 del teclado
		jugador2 = sc.nextLine();
		
		//SEparación de textos
		System.out.println("\n");
		
		//Pongo esto fuera del condicional para evitar redundancia
		System.out.print("El resultado es: ");
		
		//Creo el condicional para dar los resultados
		if (jugador1.equals("PAPEL") && jugador2.equals("PAPEL") || jugador1.equals("PIEDRA") && jugador2.equals("PIEDRA") || jugador1.equals("TIJERA") && jugador2.equals("TIJERA") ) {
			
			System.out.println("Empate"); //Si se cumple la condición anterior se imprime que hubo un empate
			
		}else if (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA") || jugador1.equals("PIEDRA") && jugador2.equals("TIJERA") || jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) {
			
			System.out.println("El jugador 1 gana"); //Si se cumple la condición anterior se imprime que gana el jugador 1
			
		}else if (jugador1.equals("PIEDRA") && jugador2.equals("PAPEL") || jugador1.equals("TIJERA") && jugador2.equals("PIEDRA") || jugador1.equals("PAPEL") && jugador2.equals("TIJERA")) {
			
			System.out.println("El jugador 2 gana"); //Si se cumple la condición anterior se imprime que gana el jugador 2
			
		}else {//Si se introduce un valor que no sea PIEDRA, PAPEL o TIJERA sale un mensaje de error
			System.out.println("ERROR");
		}
		
		//Cierro el Scanner
		sc.close();
		
	}

}
