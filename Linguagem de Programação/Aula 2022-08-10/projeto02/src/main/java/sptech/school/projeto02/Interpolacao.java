package sptech.school.projeto02;

public class Interpolacao {

    public static void main(String[] args) {
        
        String nome = "Victor";
        Integer idade = 18;
        Double altura = 1.73;
        
        String frase = String.format("Nome: %s \nIdade: %d \nAltura: %.2f", nome, idade, altura);
        
        System.out.println(frase);
    }
    
}
