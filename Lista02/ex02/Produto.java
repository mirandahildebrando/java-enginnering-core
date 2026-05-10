package Lista02.ex02;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    public void calcularValorTotal() {
        double valorTotal = preco * quantidade;
        System.out.println("Valor total em estoque: R$ " + valorTotal);
    }

    public static void main(String args[]) {

System.out.print("\033[H\033[2J");  
System.out.flush();

        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(3800.00);
        produto.setQuantidade(10);
        
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidade());

        produto.adicionarEstoque(5);
        System.out.println("Quantidade em estoque após adicionar: " + produto.getQuantidade());
        produto.removerEstoque(3);
        System.out.println("Quantidade em estoque após remover: " + produto.getQuantidade());
        produto.calcularValorTotal();
    }
}
