package Lista02.ex03;

public class Cachorro extends Animal {

    private String nome;

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String args[]) {

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Spike");
        System.out.println("O nome do cachorro é: " + cachorro.getNome());
        cachorro.emitirSom();

        Gato gato = new Gato();
        gato.setNome("Mingau");
        System.out.println("O nome do gato é: " + gato.getNome());
        gato.emitirSom();

    }

}
