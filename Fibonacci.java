package br.ucsal;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int fibo = 0;
		int anterior = 0;	
		
		
		System.out.print("Insira um número: ");
		n = scan.nextInt();
		
		
		for(int i = 1; i<= n; i++) {
			
			if ( i == 1) {
				fibo = 1;
				
			}	else {
				fibo += anterior;
				anterior = fibo - anterior;
			}
			
			if (fibo==n){
				
				System.out.println("O número " + n + " Pertence a Fibonacci!");
				
			}else if(i==n) {
				System.out.println("O número " + n + " Não pertence a Fibonacci!");
			}
			
			
		}	
		
			
		
			scan.close();
	}

}
