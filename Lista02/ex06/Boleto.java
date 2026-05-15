package Lista02.ex06;

public class Boleto implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Gerando boleto...");
        System.out.println("Pagamento de R$ " + valor + " realizado com boleto");
    }

}
