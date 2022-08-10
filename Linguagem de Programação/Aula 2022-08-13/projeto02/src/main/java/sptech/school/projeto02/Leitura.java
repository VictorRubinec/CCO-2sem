package sptech.school.projeto02;

import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        // Assistente para a captura de dados inseridos na execução
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade:");
        Integer idade = leitor.nextInt();

        System.out.println("Digite sua altura:");
        Double altura = leitor.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

}
