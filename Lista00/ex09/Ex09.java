package Lista00.ex09;

public class Ex09 {

    public static void main(String args[] ) {

    System.out.print("\033[H\033[2J");  
    System.out.flush();

        int numeros[] = {12, 5, 45, 2, 8, 64, 70};

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }

}
