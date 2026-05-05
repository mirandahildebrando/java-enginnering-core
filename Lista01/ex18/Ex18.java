package Lista01.ex18;

public class Ex18 {

    public static void main(String[] args) {

System.out.print("\033[H\033[2J");  
System.out.flush();

        int array[] = {1, 15, 25, 25, 30, 95, 40, 33, 15, 00, 14, 27, 10, 9, 2};

        System.out.println("Array sem duplicados: ");   

        for(int i = 0; i < array.length; i++) {
            boolean duplicado = false;

            for(int j = 0; j < i; j++) {
                if(array[i] == array[j]) {
                    duplicado = true;
                    break;
                }
            }
            if(!duplicado) {
                System.out.print(array[i] + " ");
            }
        }

        
    }
}
