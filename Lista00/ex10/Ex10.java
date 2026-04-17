package Lista00.ex10;

public class Ex10 {

    public static void main(String args[]) {

    System.out.print("\033[H\033[2J");  
    System.out.flush();

        int numeros[] = {10, 20, 30, 40, 50};

        int inicio = 0;
        int fim = numeros.length - 1;

        while(inicio < fim) {
            int aux = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = aux;

            inicio++;
            fim--;
        }

        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
    }

}
