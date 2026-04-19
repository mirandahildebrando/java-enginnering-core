package Lista01.ex04;

public class Ex04 {

    public static void main(String args[]) {

System.out.print("\033[H\033[2J");  
System.out.flush();

        int numero = 11;

        int divisores = 0;

        for(int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        if (divisores == 0) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}
