public class AULA11_1 {
    //AULA 11:: Crie uma classe para representar um produto de uma loja. Atributos: nome, preço e quantidade total estoque. Crie um construtor para a classe Produto que receba como parâmetros o nome, o preço e a quantidade inicial em estoque.
    // ● Crie um método exibirInfo() que imprime no console todas as informações do produto.
    // ● Crie um método calcularValorTotalEmEstoque() que retorna um double. Este método deve calcular e retornar o valor total do produto em estoque (preço * quantidade).
    // ● Crie um método adicionarEstoque(int quantidade) que adiciona a quantidade informada ao estoque do produto.
    // ● Criar uma Classe de Teste com o método main. Dentro do main, instancie (crie) pelo menos dois objetos diferentes da classe Produto. Para cada produto, chame o método exibirInfo(). Calcule e imprima o valor total em estoque de um dos produtos. Adicione mais itens ao estoque de um dos produtos e exiba as informações novamente para ver a atualização.
    public class Produto {
        // Atributos
        private String nome;
        private double preco;
        private int quantidadeEstoque;
    
        // Construtor
        public Produto(String nome, double preco, int quantidadeInicial) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEstoque = quantidadeInicial;
        }
    
        // Métodos opcionais para visualização (Getters)
        public String getNome() {
            return nome;
        }
    
        public double getPreco() {
            return preco;
        }
    
        public int getQuantidadeEstoque() {
            return quantidadeEstoque;
        }
    }
}