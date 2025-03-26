package rana;

import java.util.Random;

public class Tablero {
	private boolean estanque[][];
	Random r;

	public Tablero() {

		this.estanque = new boolean[5][5];
		posicionarRana();

	}

	private boolean[][] posicionarRana() {
		r = new Random();
		for (int i = 0; i < estanque.length; i++) {
			for (int j = 0; j < estanque.length; j++) {
				estanque[i][j] = false;
			}
		}

		estanque[r.nextInt(5)][r.nextInt(5)] = true;

		return estanque;

	}

	public boolean caza(int x, int y) {

		if (estanque[x][y] == true) {
			
			return false;

		} else if (comprobarSiSalta(x, y) == true) {
			System.out.println("Has estado cerca, la rana ha saltado");
			

		}
		return true;

	}

	private boolean comprobarSiSalta(int x, int y) {

		int rana[] = new int[2];
		for (int i = 0; i < estanque.length; i++) {
			for (int j = 0; j < estanque.length; j++) {
				if (estanque[i][j] == true) {
					rana[0] = i;
					rana[1] = j;

				}
			}

		}
		if ((x == rana[0] && (y + 1 == rana[1] || y - 1 == rana[1]))) {
			posicionarRana();
			return true;
		}

		else if ((y == rana[1] && (x + 1 == rana[0] || x - 1 == rana[0]))) {
			posicionarRana();
			return true;
		} else if ((y + 1 == rana[1] || y - 1 == rana[1]) && (x + 1 == rana[0] || x - 1 == rana[0])) {
			posicionarRana();
			return true;
		} else
			return false;

	}

	@Override
	public String toString() {
		String representar = "";
		representar += "   0  1  2  3  4\n";
		for (int i = 0; i < estanque.length; i++) {
			for (int j = 0; j < estanque.length; j++) {
				if (estanque[i][j] == true && j==0) {
					representar += i + " [r]";
				}
				else if (estanque[i][j] == true) {
					representar += "[r]";
				}
				else if (j==0) {
					representar += i +" [ ]";
				}

				else
					representar += "[ ]";
			}
			representar += "\n";
		}
		return representar;

	}

}
