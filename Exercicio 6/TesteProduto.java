import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // D) Instanciando dois objetos diferentes
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Mouse Gamer", 150.50, 50);

        // Exibindo informações iniciais
        p1.exibirInfo();
        p2.exibirInfo();

        System.out.println("\n--- Operações ---");

        // Calculando e imprimindo o valor total de um dos produtos
        double valorTotalP1 = p1.calcularValorTotalEmEstoque();
        System.out.printf("Valor total do estoque de %s: R$ %.2f%n", "Notebook", valorTotalP1);

        // Adicionando itens ao estoque do produto 2 (Mouse Gamer)
            System.out.print("Digite a quantidade a ser adicionada ao Estoque: ");
            int NovoEstoque = scanner.nextInt();
            p2.adicionarQuantidade(NovoEstoque);

        // Exibindo informações atualizadas do produto 2
        p2.exibirInfo();
    }
}