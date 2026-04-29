package AULA11_1;

public class AULA11_2 {
    public void exibirInfo() {
        System.out.println("Informações do Produto: ");
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco); // Formata para duas casas decimais
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("------------------------------");
    }
}