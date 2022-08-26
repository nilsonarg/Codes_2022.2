package br.ucsal;

import java.util.Scanner;

public class Segundos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horas, minutos, segundos, total1, total2, resultado;
		
		System.out.println("Informe a hora inicial");
		horas = scan.nextInt();
		System.out.println("Informe o minuto inicial");
		minutos = scan.nextInt();
		System.out.println("Informe os segundos iniciais");
		segundos = scan.nextInt();
		
		total1 = (horas*3600) + (minutos*60) + segundos;
		
		System.out.println("Informe a hora final");
		horas = scan.nextInt();
		System.out.println("Informe o minuto final");
		minutos = scan.nextInt();
		System.out.println("Informe os segundos final");
		segundos = scan.nextInt();
		
		total2 = (horas*3600) + (minutos*60) + segundos; 
		
		resultado = total2 - total1;
		
		horas = resultado/3600;
		resultado = resultado%3600;
		minutos = resultado/60;
		segundos = resultado%60;
		
		System.out.print("Sua atividade durou ");
		System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
		
		
			scan.close();
	}

}
