package Lista01.ex10;

import java.util.Scanner;

public class Ex10 {

    public static void main(String args[] ) {

System.out.print("\033[H\033[2J");  
System.out.flush();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro : ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro : ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro : ");
        int num3 = scanner.nextInt();

        int temp;

        if(num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if(num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if(num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Números em ordem crescente : " + num1 + " " + num2 + " " + num3);

        scanner.close();
    }
    
}
