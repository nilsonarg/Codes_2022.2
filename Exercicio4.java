package br.ucsal;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int enquadramento;
		double horas, total;
		
		System.out.println("Quantas horas você trabalhou? ");
		horas = scan.nextDouble();
		System.out.println("Escolha o seu enquadramento:"
				+ "\r DIGITE 1 PARA NIVEL 1"
				+ "\r DIGITE 2 PARA NiVEL 2"
				+ "\r DIGITE 3 PARA NIVEL 3");
		enquadramento = scan.nextInt();
		
		switch(enquadramento) {
			
		case 1: 
			total = horas * 12;
				
				System.out.println(total + " reais");
			break;
			
		case 2: 
			total = horas * 17;
			System.out.println(total + " reais");
			
			break;
			
		case 3:
			total = horas * 25;
			System.out.println(total + " reais");
			
			break;
		}
		
		
		
			scan.close();
	}

}
