package Lista00.ex03;

import java.util.Scanner;

public class ex03 {

    public static void main(String args[]) {

    System.out.print("\033[H\033[2J");  
    System.out.flush();    

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        if (num % 3 == 0) {
            System.out.println("O número é múltiplo de 3.");
        } else {
            System.out.println("O número não é múltiplo de 3.");
        }
        if (num % 5 == 0) {
            System.out.println("O número é múltiplo de 5.");
        } else {
            System.out.println("O número não é múltiplo de 5.");
        }
        scanner.close();

    }

}
