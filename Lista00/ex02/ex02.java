package Lista00.ex02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String args[]) {

    System.out.print("\033[H\033[2J");  
    System.out.flush();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double b = scanner.nextDouble();

        double soma = a + b;
        double subtracao = a - b;
        double multiplicacao = a * b;
        double divisao = 0;
        if (b != 0) {
            divisao = a / b;
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        scanner.close();
    }



}
