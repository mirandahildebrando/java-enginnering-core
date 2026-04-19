package Lista01.ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String args[]) {

    System.out.print("\033[H\033[2J");  
    System.out.flush();

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    if(numero % 2 == 0) {
        System.out.println("O número " + numero + " é par.");
    } else {
        System.out.println("O número " + numero + " é ímpar.");
    }

    scanner.close();
    }
    

}
