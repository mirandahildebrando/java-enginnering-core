package Lista00.ex07;

public class Ex07 {

    public static void main(String args[]) {

    System.out.print("\033[H\033[2J");  
    System.out.flush();

    for(int i = 1; i <= 10; i++) {
        System.out.println("Tabuada do " + i);

        for(int j = 1; j <= 10; j++) {
            System.out.println(i + " x " + j + " = " + (i * j));
        }
        System.out.println();
        }
    }
}
