package sptech.school.lista01.nivelamento;

import java.util.Scanner;

public class BolsaFilhos {

    public static void main(String[] args) {

        Integer f0_3;
        Integer f4_16;
        Integer f17_18;
        Integer total;

        Double auxilio;

        String frase;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos filhos de 0 a 3 anos possui?");
        f0_3 = leitor.nextInt();

        System.out.println("Quantos filhos de 4 a 16 anos possui?");
        f4_16 = leitor.nextInt();

        System.out.println("Quantos filhos de 17 a 18 anos possui?");
        f17_18 = leitor.nextInt();
        
        total = f0_3 + f4_16 + f17_18;
        auxilio = (f0_3*25.12)+(f4_16*15.88)+(f17_18*12.44);
        
        frase = String.format("Você tem um total de %d filhos e vai receber "
                + "R$%.2f de bolsa", total, auxilio);
        System.out.println(frase);
    
    }
}