package sptech.school.lista01.nivelamento;

import java.util.Scanner;

public class SalarioBruto {

	public static void main(String[] args) {
	
		Double salarioB;
		Double salarioL;
		Double descontos;
		Double inss;
		Double ir;
		Double v_vt;
		Double vt;
		
		String frase;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu salário bruto:");
		salarioB = leitor.nextDouble();
		
		inss = salarioB * 0.1;

		ir = salarioB * 0.2;
		
		System.out.println("Quanto você gasta de condução diária na ida ao trabalho:");
		v_vt = leitor.nextDouble();
		
		vt = v_vt * 2 * 22;
		
		descontos = inss + ir + vt;
		
		salarioL = salarioB - descontos;
		
		
		frase = String.format("Seu salário bruto é R$%.2f, tem um total "
				+ "de R$%.2f em descontos e receberá um líquido de R$%.2f",
				salarioB, descontos, salarioL);
		
		System.out.println(frase);
		
	}
	
}
