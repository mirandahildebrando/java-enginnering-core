package Lista01.ex00;

import java.util.Scanner;

public class Ex00 {

    public static void main(String args[]) {

    System.out.print("\033[H\033[2J");  
    System.out.flush();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo ou negativo: ");

        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
  
    }
}
