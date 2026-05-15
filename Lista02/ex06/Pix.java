package Lista02.ex06;

public class Pix implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Gerando QR Code para pagamento...");
        System.out.println("Pagamento de R$ " + valor + " realizado com Pix");
    }

}
