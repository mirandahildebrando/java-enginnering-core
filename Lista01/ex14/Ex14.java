package Lista01.ex14;

public class Ex14 {
    public static void main(String[] args) {
System.out.print("\033[H\033[2J");  
System.out.flush();

        int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;

        for (int i = 0; i < ar.length; i++) {
            soma += ar[i];
        }
        System.out.println("A soma dos números é: " + soma);
    }

}
