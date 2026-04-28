public class Ex09 {

        public static void main (String[] args) {

    System.out.print("\033[H\033[2J");  
    System.out.flush();
        int numeroOriginal = 121;
        
        boolean resultado = ePalindromo(numeroOriginal);
        System.out.println("O número " + numeroOriginal + " é palíndromo? " + resultado);
        }

    public static boolean ePalindromo(int num) {
        if (num < 0) return false;

        int numero = num; 
        int reverso = 0;

        while (numero > 0) {
            int ultimoDigito = numero % 10;          
            reverso = (reverso * 10) + ultimoDigito; 
            numero = numero / 10;                  
        }

        return num == reverso;
    
}
    }
