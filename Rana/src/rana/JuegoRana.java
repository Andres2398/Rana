package rana;

import java.util.Scanner;

public class JuegoRana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Tablero estanque = new Tablero();

		boolean seguir = true;
		while (seguir) {
			System.out.println("Introduce las cordenadas donde quieres disparar");
			System.out.println(estanque.toString());
			String cordenadas = sc.next();
			char cordenadaX = cordenadas.charAt(0);
			char cordenadaY = cordenadas.charAt(1);
			int x = Character.getNumericValue(cordenadaX);
			int y = Character.getNumericValue(cordenadaY);
			seguir = estanque.caza(x, y);
			if(seguir=false) {
				System.out.println("Rana cazada");
			}
				
		}

	}

}
