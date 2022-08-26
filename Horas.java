package br.ucsal;

import java.util.Scanner;

public class Horas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int segundos, horas, minutos;
		
		System.out.print("Informe uma quantidade de segundos: ");
		segundos = scan.nextInt();
		
		horas = segundos/3600;
		segundos = segundos%3600;
		minutos = segundos/60;
		segundos = segundos%60;
		
		
		
		if (horas == 1) {
			System.out.println(horas + " hora " + minutos + " minutos " + segundos + " segundos.");
			System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
		}
		
		else if (minutos == 1) {
			System.out.println(horas + " horas " + minutos + " minuto " + segundos + " segundos.");
			System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
		}
		else {
			System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos.");
			System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
		}
		
		scan.close();
	}

}
