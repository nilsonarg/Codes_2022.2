package br.ucsal;

import java.util.Random;

public class MaiorVetor {

	public static void main(String[] args) {

		int[] vetor;



	}

	public static void maior_valor(int[] v) {
		Random rand = new Random();
		int maior = 0;

		for(int i = 0; i<v.length; i++) {
			v[i] = rand.nextInt(5);


			if(v[i] > v[maior]) {
				maior = i;
				
			}

		}

	}
	
	public static void mostra(int[] v) {
		
	}

}
