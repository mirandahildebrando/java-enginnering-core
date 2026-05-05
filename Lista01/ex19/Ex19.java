package Lista01.ex19;

public class Ex19 {

    public static void main(String[] args) {

System.out.print("\033[H\033[2J");  
System.out.flush();


        int[] numeros = {12, 35, 1, 10, 34, 1};

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            int atual = numeros[i];

            if (atual > maior) {
                segundoMaior = maior; 
                maior = atual;        
            } 

            else if (atual > segundoMaior && atual != maior) {
                segundoMaior = atual;
            }
        }

        if (segundoMaior == Integer.MIN_VALUE) {
            System.out.println("Não existe um segundo maior valor.");
        } else {
            System.out.println("O maior é: " + maior);
            System.out.println("O segundo maior é: " + segundoMaior);
        }
    }
}
