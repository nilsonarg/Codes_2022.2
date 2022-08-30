package br.ucsal;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int fibo = 0;
		int anterior1=0;	
		
		
		System.out.print("Insira um número: ");
		n = scan.nextInt();
		
		
		for(int i =1; i<= 100; i++) {
			
			if ( i == 1) {
				fibo = 1;
				
			}	else {
				fibo += anterior1;
				anterior1 = fibo - anterior1;
			}
			
			if (fibo==n){
				
				System.out.println("O número " + n + " Pertence a Fibonacci!");
				
			} 
					
			
		}	
		
			
		
			scan.close();
	}

}
