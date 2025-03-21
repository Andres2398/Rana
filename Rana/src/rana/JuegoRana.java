package rana;

import java.util.Scanner;

public class JuegoRana {
	
	
	public static double iniciar() {
		Scanner sc = new Scanner(System.in);
		
		boolean seguir=true;
		while(seguir) {
			System.out.println("Introduce las cordenadas donde quieres disparar");
			String cordenadas = sc.next();
			char cordenadaX = cordenadas.charAt(0);
			char cordenadaY = cordenadas.charAt(1);
			seguir=Tablero.caza(cordenadaX,cordenadaY);
			
		}
		return 0;
	}

	public static void main(String[] args) {

		iniciar();
		
		

	}

}
