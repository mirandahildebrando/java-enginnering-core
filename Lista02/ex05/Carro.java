package Lista02.ex05;

public class Carro {

    private String modelo;

    private Motor motor;

    public Carro (String modelo) {
        this.modelo = modelo;
        this.motor = new Motor();
    }

    public void ligarCarro() {
        System.out.println("Ligando o carro " + this.modelo);
        motor.ligar();

        if(motor.isLigado()) {
            System.out.println("O carro " + this.modelo + " está pronto para ser dirigido.");
        }
    }

    public String getModelo() {
        return modelo;
    }

}
