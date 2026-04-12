package Lista00.ex01;

public class Ex01 {

    public static void main(String args[]) {
        
        String nome = "Nome: X";
        String idade = "Idade: Y";
        String altura = "Altura: Z";

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
    }

}
