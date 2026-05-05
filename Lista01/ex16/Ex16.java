package Lista01.ex16;

public class Ex16 {

    public static void main(String[] args) {

System.out.print("\033[H\033[2J");  
System.out.flush();

        int array[] = {1, 2, 3, 4, 5
        };

        int ver = 10;

        for( int i = 0; i < array.length; i++) {
            if(array[i] == ver) {
                System.out.println("O número " + ver + " está presente no array.");
                return;
            }
        }
        System.out.println("O número " + ver + " não está presente no array.");
    }
}
