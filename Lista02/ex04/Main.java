

public class Main {

    public static void main(String[] args) {

        Funcionario gerente = new Gerente("João", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Maria", 3000);

        System.out.println(gerente.getNome() + " - Salário: " + gerente.salario + " - Bônus: " + gerente.calcularBonus());
        System.out.println(desenvolvedor.getNome() + " - Salário: " + desenvolvedor.salario + " - Bônus: " + desenvolvedor.calcularBonus());
    }

}
