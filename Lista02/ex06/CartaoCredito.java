package Lista02.ex06;

public class CartaoCredito implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Enviando requisição para operadora do cartão...");
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão de crédito");
    }

}
