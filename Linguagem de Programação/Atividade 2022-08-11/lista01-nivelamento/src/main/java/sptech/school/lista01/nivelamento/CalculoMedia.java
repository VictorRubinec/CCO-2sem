package sptech.school.lista01.nivelamento;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		
		String nome;
		String frase;
		
		Double nota1;
		Double nota2;
		Double media;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		nome = leitor.nextLine();
		
		System.out.println("Digite a nota da 1° prova:");
		nota1 = leitor.nextDouble();
		
		System.out.println("Digite a nota da 2° prova:");
		nota2 = leitor.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		frase = String.format("Olá, %s. Sua média foi de %.1f", nome, media);
	}
	
}
