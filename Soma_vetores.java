package br.ucsal;

import java.util.Random;

public class Soma_vetores {

	public static void main(String[] args) {
		int[] vet1, vet2, s;
		vet1 = new int[5];
		vet2 = new int[5];
		preenche(vet1);
		preenche(vet2);
		mostra(vet1);
		mostra(vet2);
		s = soma(vet1, vet2);
		mostra(s);
	}
	public static void preenche(int[] v) {
		int i;
		Random rand = new Random();
		for(i=0; i<v.length; i++) {
			v[i] = rand.nextInt(10);
		}		
	}
	
	public static void mostra(int[] v) {
		int i;
		for (i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
			
		}
		System.out.println();
			
		}
	
	public static int[] soma(int[] v1, int[] v2) {
		int[] s;
		s = new int[v2.length];
		
		for (int i = 0; i < v2.length; i++) {
			s[i] = v1[i] + v2[i];
		}
		return s;
	}
	
	}
	
