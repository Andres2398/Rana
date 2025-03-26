package rana;

import java.util.Scanner;

public class JuegoRana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Tablero estanque = new Tablero();

		
		
		
		boolean seguir=true;
		
		while (seguir==true) {
			
			System.out.println(estanque.toString());
			System.out.println("Introduce las cordenadas donde quieres disparar");
			String cordenadas = sc.next();
			char cordenadaX = cordenadas.charAt(0);
			char cordenadaY = cordenadas.charAt(1);
			int x = Character.getNumericValue(cordenadaX);
			int y = Character.getNumericValue(cordenadaY);
			seguir = estanque.caza(x, y);
			
			if(seguir==false) {
				System.out.println("Rana cazada");
				
			}
			else 
				System.out.println("El juego sigue");
				
		}

	}

}
