package br.ucsal;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, resultado;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = scan.nextFloat();
		
		System.out.print("Informe a segunda nota: ");
		nota2 = scan.nextFloat();
		
		System.out.print("Informe a terceira nota: ");
		nota3 = scan.nextFloat();
		
		System.out.print("Informe a quarta nota: ");
		nota4 = scan.nextFloat();
		resultado = (nota1 + nota2 + nota3 + nota4)/4;
		
		
		if (resultado >= 7) {
			System.out.println("Sua média foi " + resultado + ", você foi aprovado!!");
			
		}
		
		else {
			System.out.println("Sua média foi " + resultado + ", você foi reprovado!!");
		}
			
		
		scan.close();
	}

}
