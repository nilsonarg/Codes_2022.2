package br.ucsal;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Qual é a sua idade? ");
		idade = scan.nextInt();
		
		if (idade <= 15) {
			
			System.out.println("Sem permissao para votar!");
		}
		
		else if (idade >= 16 && idade <= 17 || idade > 65) {
			
			System.out.println("Voto facultativo!");
		}
		
		else {
			System.out.println("Voto obrigatório!");
		}
		
		scan.close();
	

	}

}
