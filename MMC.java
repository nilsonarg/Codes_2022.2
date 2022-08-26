package br.ucsal;

import java.util.Scanner;

public class MMC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		
		System.out.println("Insira dois números: ");
		a = scan.nextInt();
		b = scan.nextInt();
		int mmc = a;
		
		while(!((mmc % a ==0) && (mmc % b == 0))) {
			
			
			
							
			mmc++;
			
		}
		
		
		System.out.println(mmc);
		
		
		scan.close();
	}

}
