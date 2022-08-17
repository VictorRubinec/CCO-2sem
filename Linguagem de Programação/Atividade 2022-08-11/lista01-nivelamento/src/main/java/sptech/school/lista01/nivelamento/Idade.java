package sptech.school.lista01.nivelamento;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		String nome;
		
		Integer nasc;
		Integer idade;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		nome = leitor.nextLine();
		
		System.out.println("Olá, " + nome + "! Qual o ano de seu nascimento:");
		nasc = leitor.nextInt();
		
		idade = 2030 - nasc;
		
		System.out.println("Em 2030 você terá " + idade + " anos");
	}
	
}
