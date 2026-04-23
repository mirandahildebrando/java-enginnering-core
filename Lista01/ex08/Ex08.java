package Lista01.ex08;

public class Ex08 {

    public static void main(String[] args) {
        
System.out.print("\033[H\033[2J");  
System.out.flush();

        int a = 123;

        int soma = 0;

        while(a != 0) {
            int digito = a % 10;
            soma += digito;
            a = a / 10;
        }

        System.out.println("A soma dos dígitos é: " + soma);


    }

}
