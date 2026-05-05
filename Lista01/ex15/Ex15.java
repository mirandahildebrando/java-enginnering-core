

public class Ex15 {

    public static void main(String[] args) {
        
System.out.print("\033[H\033[2J");  
System.out.flush();

        double array[] = {1.0, 2.0, 3.0, 4.0, 5.0
        };

        double soma = 0.0;
        for(int i = 0; i < array.length; i++) {
            soma += array[i];
        }
            double media = soma / array.length;

            System.out.println("A média é: " + media);
        
    }

}
