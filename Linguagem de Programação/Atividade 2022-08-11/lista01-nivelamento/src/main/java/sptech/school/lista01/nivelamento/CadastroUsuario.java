package sptech.school.lista01.nivelamento;

import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {
        
        String usuario;
        String frase;
        
        Integer senha;
        Integer qtdErro;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu usuário:");
        usuario = leitor.nextLine();
        
        System.out.println("Digite sua senha:");
        senha = leitor.nextInt();
        
        System.out.println("Quantas vezes pode errar a senha no login:");
        qtdErro = leitor.nextInt();
        
        frase = String.format("Seu login é %s e sua senha é %d. Você tem %d tentativas "
                + "antes de ser bloqueado", usuario, senha, qtdErro);
        System.out.println(frase);   
    }
}
