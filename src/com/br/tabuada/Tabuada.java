package com.br.tabuada;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha um numero: ");
		int numeroEscolhido = entrada.nextInt();
		 
		for(int i = numeroEscolhido; i <= 10; i++ ) {
			System.out.println(numeroEscolhido + "x" + i + "=" + (numeroEscolhido*i));
		}	
	}
}
