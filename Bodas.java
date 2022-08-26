package br.ucsal;

import java.util.Scanner;

public class Bodas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int anos;
		
		System.out.print("Informe a quantos anos vocês estão casados: ");
		anos = scan.nextInt();
		
		switch (anos) {
		case 1: System.out.println("Vocês estão nas Bodas de Papel");
		
			break;
		
		case 10: System.out.println("Vocês estão nas Bodas de Estanho");
		
			break;
			
		case 20: System.out.println("Vocês estão nas Bodas de Porcelana");
		
			break;
			
		case 30: System.out.println(" Vocês estão nas Bodas de Pérola");
		
			break;
			
		case 40: System.out.println("Vocês estão nas Bodas de Esmeralda");
		
			break;
			
		case 50: System.out.println("Vocês estão nas Bodas de Ouro");
		
			break;
			
		default: System.out.println("Não sei informar!");
		}
		
		scan.close();
	}

}
