package br.ucsal;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double quantidade, total;
		
		System.out.println("Quantas maçãs deseja comprar? ");
		quantidade = scan.nextDouble();
		
		if (quantidade <12) {
			total = quantidade * 0.3;
			System.out.println(total + " reais");
			
		}
		else {
			total = quantidade * 0.25;
			System.out.println(total + " reais");
		}
		
			scan.close();
	}

}
