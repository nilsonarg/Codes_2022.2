package br.ucsal;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.println("Insira um número:");
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			if( n % i == 0 ) {
				
				System.out.println(i);
				
			}
			
			
		}
		
		
		scan.close();
	}

}
