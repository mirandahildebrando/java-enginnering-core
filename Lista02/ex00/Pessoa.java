package Lista02.ex00;

public class Pessoa {

    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public static void main(String args[]) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Pessoa p = new Pessoa();
        p.setNome("João");
        p.setIdade(28);

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
    }
}