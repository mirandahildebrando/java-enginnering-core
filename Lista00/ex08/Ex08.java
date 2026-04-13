package Lista00.ex08;

public class Ex08 {

    public static void main(String[] args) {

    System.out.print("\033[H\033[2J");  
    System.out.flush();

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
            }
        }
        System.out.println("A soma dos números pares é: " + soma);
    }

}
