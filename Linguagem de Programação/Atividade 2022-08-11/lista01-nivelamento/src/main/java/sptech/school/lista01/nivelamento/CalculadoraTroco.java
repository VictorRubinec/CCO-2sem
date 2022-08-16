package sptech.school.lista01.nivelamento;

import java.util.Scanner;

public class CalculadoraTroco {

    public static void main(String[] args) {
        
        Double valor;
        Double pago;
        Double troco;
        Double total;
        
        Integer qtd;
        
        String frase;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor unitário do produto:");
        valor = leitor.nextDouble();
        
        System.out.println("Digite a quantidade de produtos:");
        qtd = leitor.nextInt();
        
        System.out.println("Digite o valor pago no caixa:");
        pago = leitor.nextDouble();
        
        total = valor*qtd;
        
        if(total > pago){
        
            System.out.println("O valor pago é insuficiente! Tente novamente");
        } else {
        
            troco = total - pago;
            
            frase = String.format("Seu troco será de R$%.2f", troco);
            
            System.out.println(frase);
        }
    }
    
}
