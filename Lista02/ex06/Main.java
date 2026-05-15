package Lista02.ex06;

public class Main {

    public static void main(String[] args) {
        double valor = 150.00;

        Pagamento cartaoCredito = new CartaoCredito();
        cartaoCredito.realizarPagamento(valor);

        System.out.println();

        Pagamento pix = new Pix();
        pix.realizarPagamento(valor);

        System.out.println();

        Pagamento boleto = new Boleto();
        boleto.realizarPagamento(valor);
    }

}
