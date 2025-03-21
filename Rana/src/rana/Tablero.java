package rana;

import java.util.Arrays;
import java.util.Random;

public class Tablero {
	private boolean estanque[][];
	Random r;

	public Tablero() {

		this.estanque = new boolean[5][5];

	}

	public boolean[][] rana() {

		estanque[r.nextInt(5)][r.nextInt(5)] = true;

		return estanque;

	}

	public boolean caza(char cordenadaX, char cordenadaY) {

		if (estanque[cordenadaX][cordenadaY] == true) {
			return true;

		} else {
			return false;

		}
	}

	@Override
	public String toString() {
		return "Tablero [estanque=" + Arrays.toString(estanque) + "]";
	}

}
