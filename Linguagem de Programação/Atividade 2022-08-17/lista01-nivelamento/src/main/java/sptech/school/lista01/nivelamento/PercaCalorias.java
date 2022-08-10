package sptech.school.lista01.nivelamento;

import java.util.Scanner;

public class PercaCalorias {

    public static void main(String[] args) {
        
        Integer exAque;
        Integer exAero;
        Integer exMusc;
        Integer mins;
        Integer calorias;
        
        String frase;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos minutos de aquecimento você fez?");
        exAque = leitor.nextInt();
        
        System.out.println("Quantos minutos de exercícios aeróbicos você fez?");
        exAero = leitor.nextInt();
        
        System.out.println("Quantos minutos de musculação você fez?");
        exMusc = leitor.nextInt();
        
        mins = exAero+exAque+exMusc;
        calorias = (exAque*12)+(exAero*20)+(exMusc*25);
        
        frase = String.format("Olá, Jorge. Você fez um total de %d minutos de "
                + "exercícios e perdeu cerca de %d calorias", mins, calorias);
        
        System.out.println(frase);
    }
}
