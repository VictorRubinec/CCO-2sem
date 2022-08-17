package sptech.school.lista01.nivelamento;

import java.util.Scanner;

public class Elevador {

	public static void main(String[] args) {
		
		Double pesoMax;
		Double pessoasMax;
		Double peso1;
		Double peso2;
		Double peso3;
		Double pesoTotal;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o limite de peso do elevador:");
		pesoMax = leitor.nextDouble();
		
		System.out.println("Digite o limite de pessoas no elevador:");
		pessoasMax = leitor.nextDouble();
		
		System.out.println("Peso da 1° pessoa:");
		peso1 = leitor.nextDouble();
		
		System.out.println("Peso da 2° pessoa:");
		peso2 = leitor.nextDouble();
		
		System.out.println("Peso da 3° pessoa:");
		peso3 = leitor.nextDouble();
		
		pesoTotal = peso1 + peso2 + peso3;
		
		System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + pessoasMax 
				+ " pessoas.\nO peso total no elevador é de " + pesoTotal + ", sendo que "
				+ "ele suporta " + pesoMax + ".\n(onde " + peso1 + " é o 2º valor lido "
				+ "no programa, " + peso1 + " o 1º e " + pesoTotal + " é a soma dos pesos "
				+ "das 3 pessoas)");
	}
	
}
