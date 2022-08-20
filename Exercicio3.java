package br.ucsal;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.println("Insira um valor para cada lado do triangulo.");
		System.out.print("Primeiro lado: ");
		v1 = scan.nextInt();
		
		System.out.print("Segundo lado: ");
		v2 = scan.nextInt();
		
		System.out.print("Terceiro lado: ");
		v3 = scan.nextInt();
		
			if ( v1 > v2 + v3 || v2 > v3 + v1 || v3 > v1 + v2) {
				
				System.out.println("Valores inválidos!");
			}
		
			else {
				
				if (v1 == v2 && v1 == v3 && v3 == v2) {
					
					System.out.println("Triangulo Equilátero!");
					
				}
				
				else if (v1 == v2 || v1 == v3 || v3 == v2) {
					
					System.out.println("Triangulo Isóceles!");
				}
				
				else {
					
					System.out.println("Triangulo Escaleno!");
					
				}
				
			}
			
			
			scan.close();
	}

}
