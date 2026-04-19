package Lista01.ex02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String args[]) {

    System.out.print("\033[H\033[2J");  
    System.out.flush();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número inteiro: ");
    int num1 = scanner.nextInt();
    System.out.println("Digite o segundo número inteiro: ");
    int num2 = scanner.nextInt();
    System.out.println("Digite o terceiro número inteiro: ");
    int num3 = scanner.nextInt();

    int maior = num1;
    if (num2 > maior) {
        maior = num2;
    }
    if (num3 > maior) {
        maior = num3;
    }
    System.out.println("O maior número é: " + maior);
    scanner.close();
    }

}
