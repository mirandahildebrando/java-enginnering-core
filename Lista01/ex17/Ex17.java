package Lista01.ex17;

public class Ex17 {

    public static void main(String[] args) {

System.out.print("\033[H\033[2J");  
System.out.flush();

        int array[] = {1, 15, 25, 25, 30, 95, 40, 33, 15, 00, 14, 27, 10, 9, 2};

        int ocorrencias = 0;

        int numero = 25;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == numero) {
                ocorrencias++;
            }
        }
        System.out.println("O número " + numero + " ocorre " + ocorrencias + " vezes no array.");

    }
}