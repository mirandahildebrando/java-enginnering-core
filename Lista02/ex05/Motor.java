package Lista02.ex05;

public class Motor {

    private boolean ligado;


    public Motor() {
        this.ligado = false;
    }

    public void ligar() {
        if(!this.ligado) {
            this.ligado = true;
            System.out.println("O motor foi inicado");
        } else {
            System.out.println("O motor já está funcionando.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

}
