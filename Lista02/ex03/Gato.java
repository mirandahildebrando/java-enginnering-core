package Lista02.ex03;

public class Gato extends Animal{

    private String nome;

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau Miau");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
