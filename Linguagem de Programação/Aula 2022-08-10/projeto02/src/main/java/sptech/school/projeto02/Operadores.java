package sptech.school.projeto02;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        /*
        
        == -> comparação
        != -> divergência
        <  -> menor que
        >  -> maior que
        <= -> menor ou igual que
        >= -> maior ou igual que
        !  -> negação
        
         */
        Integer numero1 = 42;
        Integer numero2 = 10;

        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero1 + " é menor que " + numero2);
        } else {
            System.out.println("Ambos os dois números são iguais");
        }

        // validação de booleana
        Boolean isProfessor = false;

        if (isProfessor) {
            System.out.println("É professor ");
        } else {
            System.out.println("Não é professor");
        }

        Scanner leitor = new Scanner(System.in);

        String nome1 = "Victor";

        System.out.println("Digite o seu nome:");
        String nome2 = leitor.nextLine();

        // .equals() -> sempre para comparação de preço, serve para demais tipos também
        if (nome1.equals(nome2)) {
            System.out.println("São iguais");
        } else {
            System.out.println("Não são iguais");
        }
    }

}
