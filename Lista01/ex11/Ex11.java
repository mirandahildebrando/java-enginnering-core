package Lista01.ex11;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
System.out.print("\033[H\033[2J");  
System.out.flush();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um inteiro para calcular a tabuada : ");
        int numero = scanner.nextInt();

        for(int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
    }

}
