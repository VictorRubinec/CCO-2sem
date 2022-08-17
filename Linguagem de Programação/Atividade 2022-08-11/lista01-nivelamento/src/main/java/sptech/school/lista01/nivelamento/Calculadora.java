package sptech.school.lista01.nivelamento;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Double num1;
		Double num2;
		Double soma;
		Double sub;
		Double mult;
		Double div;
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		num1 = leitor.nextDouble();
		
		System.out.println("Digite o segundo número:");
		num2 = leitor.nextDouble();
		
		soma = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		System.out.println("Resultado da soma:\r\n"
							+ soma + "\r\n"
							+ "Resultado da subtração:\r\n"
							+ sub + "\r\n"
							+ "Resultado da multiplicação:\r\n"
							+ mult + "\r\n"
							+ "Resultado da divisão:\r\n"
							+ div + "");
	}
	
}
