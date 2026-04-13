package Lista00.ex05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String args[]) {
    
    System.out.print("\033[H\033[2J");  
    System.out.flush();

    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("1-Olá, 2-Tudo bem?, 3-Sair");
        int opcao = scanner.nextInt();

        if (opcao == 3) {
            System.out.println("Saindo...");
            break;
        } else if (opcao == 1) {
            System.out.println("Olá!");
        } else if (opcao == 2) {
            System.out.println("Tudo bem?");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    scanner.close();
    }
}