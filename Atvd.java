package br.ucsal;

import java.util.Random;

public class Atvd {

	public static void main(String[] args) {
		int[] vet;
		vet = new int[10];
		preenche(vet);
	}

	public static void preenche(int[] v) {
		Random rand = new Random();
		int i;
		for(i=0; i<v.length; i++) {
			v[i] = rand.nextInt(10);
		}
	}
	
	public static void mostra(int[] v) {
		int i;
		for(i=0; i<v.length; i++) {
			v[i] = 
		}
	}
	
}
