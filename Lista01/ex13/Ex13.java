package Lista01.ex13;

public class Ex13 {
    public static void main(String[] args) {
System.out.print("\033[H\033[2J");  
System.out.flush();

        int[] numeros = {1, 5, 3, 9, 2};

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);

    }

}
