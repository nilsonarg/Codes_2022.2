package br.ucsal;

import java.util.Scanner;

public class SomaeMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, qtd_pares=0, qtd_impares=0;
		int soma_pares=0, soma_impares=0;
		do {
			
			System.out.println("Insira um número");
			n = scan.nextInt();
				
			if(n%2==0) {
				qtd_pares++;
				soma_pares = soma_pares + n;
			}
			else {
				qtd_impares++;
				soma_impares = soma_impares + n;
			}
			
		
			
		}while (qtd_pares != 10);
		
		System.out.println("Soma pares: " + soma_pares);
		
		if(qtd_impares!=0){
			
		System.out.println("Media impares: " + soma_impares / qtd_impares);
		
		}
		
		scan.close();
	}

}
