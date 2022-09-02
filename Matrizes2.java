package br.ucsal;

import java.util.Random;

public class Matrizes2 {

	
		public static void main(String[] args) {
			int[][] mat;
			mat = new int[5][5];
			preenche(mat);
			mostra(mat);
			System.out.println(" o 5 aparece "+ conta_n(mat, 5) + " vezes");
		}
		
		public static void preenche(int[][] m) {
			Random rand = new Random();
			int i, j;
			for(i=0; i<m.length; i++) {
				for(j=0; j<m[i].length; j++) {
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
		
		public static int conta_n(int[][] m, int n) {
			int i, j, cont=0;
			
			for(i=0; i<m.length; i++) {
				for(j=0; j<m[i].length; j++) {
					if(m[i][j] == n) {
						cont++;
					}
				}
			}
			return cont;
		}

	}


