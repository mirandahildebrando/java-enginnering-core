package Lista01.ex03;

public class Ex03 {

    public static void main(String args[]) {

System.out.print("\033[H\033[2J");  
System.out.flush();

        int numero = 5;

        long fatorial = 1;

        for(int i = numero; i >= 1; i--) {
            
           fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);


    }

}
