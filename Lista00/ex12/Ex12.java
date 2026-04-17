package Lista00.ex12;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        
    System.out.print("\033[H\033[2J");  
    System.out.flush();

    String usuario = "admin";
    String senha = "1234";

    System.out.print("Digite o nome de usuário: ");
    String inputUsuario = scanner.nextLine();

    System.out.print("Digite a senha: ");
    String inputSenha = scanner.nextLine();
    int tentativas = 0;

    if(inputUsuario.equals(usuario) && inputSenha.equals(inputSenha)) {
        System.out.println("Login bem-sucedido!");
    } else {
        tentativas++;
        while(tentativas < 3) {
            System.out.println("Credenciais incorretas. Tente novamente.");
            System.out.print("Digite o nome de usuário: ");
            inputUsuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            inputSenha = scanner.nextLine();

            if(inputUsuario.equals(usuario) && inputSenha.equals(senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            }
            tentativas++;
        }
        if(tentativas == 3) {
            System.out.println("Número máximo de tentativas atingido. Acesso bloqueado.");
        }
    }

    }

}
