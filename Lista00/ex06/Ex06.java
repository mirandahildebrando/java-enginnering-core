package Lista00.ex06;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        
    System.out.print("\033[H\033[2J");  
    System.out.flush();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um inteiro para início: ");
    int num1 = scanner.nextInt();

    System.out.println("Digite um inteiro para fim: ");
    int num2 = scanner.nextInt();

    if (num1 > num2) {
        for(int i = num1; i >= num2; i--) {
            System.out.println(i);
        }
    } else {
        for(int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
  
    }
    scanner.close();
    }
}
