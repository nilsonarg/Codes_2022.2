package br.ucsal;

import java.util.Random;

public class Matrizes1 {

	public static void main(String[] args) {
		int[][] mat;
		mat = new int[5][5];
		preenche(mat);
		mostra(mat);
		diagonal_principal(mat);

	}

	public static void preenche(int[][] m) {
		int i, j;
		Random rand = new Random();
		for  (i = 0; i < m.length; i++) {
			for (j = 0; j < m[1].length; j++) {
				m[i][j] = rand.nextInt(10);
			}
		}
	}
	
	public static void mostra(int[][] m) {
		int i, j;
		for(i=0; i<m.length; i++) {
			for(j=0; j<m[i].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
	
	public static void diagonal_principal(int[][] m) {
		int i;
		
		for(i=0; i<m.length; i++) {
			System.out.print(m[i][i] + "  ");
		}
		System.out.println("é a diagonal principal");
	}
}
