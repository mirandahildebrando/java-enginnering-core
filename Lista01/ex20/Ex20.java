package Lista01.ex20;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {

System.out.print("\033[H\033[2J");  
System.out.flush();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de elementos do array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        for (int i = 0; i < n; i++) {
            soma += array[i];
            if (array[i] > maior) {
                maior = array[i];
            }
            if (array[i] < menor) {
                menor = array[i];
            }
        }

        System.out.println("O maior elemento é: " + maior);
        System.out.println("O menor elemento é: " + menor);
        System.out.println("A média dos elementos é: " + (double) soma / n);
    }
}
