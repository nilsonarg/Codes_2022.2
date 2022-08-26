package br.ucsal;

import java.util.Scanner;

public class RepWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, x, anterior, soma;
		System.out.println("Insira um valor:");
		n = scan.nextInt();
		
		anterior = 0;
		soma = 0;
		
		while((n != soma)) {
			
			System.out.println("Insira outro valor:");
			x = scan.nextInt();
										
			soma = x + anterior;
			
			anterior = x;
			
		}
		
		System.out.println("Fim!");
		
			scan.close();
	}

}
