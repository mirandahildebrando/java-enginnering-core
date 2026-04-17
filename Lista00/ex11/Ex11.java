package Lista00.ex11;

public class Ex11 {

    public static void main(String[] args) {

    System.out.print("\033[H\033[2J");  
    System.out.flush();
        
        int a[] = {10, 20, 10, 40, 10, 60};
        int b = 10;
        int quant = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == b) {
                quant++;
            }
        }

        System.out.println("O número " + b + " aparece " + quant + " vezes no vetor.");

    }

}
