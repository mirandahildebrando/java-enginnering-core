import java.util.Scanner;

public class Ex05 {

    public static void main (String args[] ) {

System.out.print("\033[H\033[2J");  
System.out.flush();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        scanner.close();
    }

}
