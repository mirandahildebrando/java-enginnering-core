package Lista02.ex01;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public void setTItular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito deve ser positivo.");
        } else {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
        }
        }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public static void main(String args[]) {

System.out.print("\033[H\033[2J");  
System.out.flush();

        ContaBancaria conta = new ContaBancaria();
        conta.setTItular("João");
        conta.setSaldo(2000.00);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());
        
        conta.depositar(500.00);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());
    }
    
}
