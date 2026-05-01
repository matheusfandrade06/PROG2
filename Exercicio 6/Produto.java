    // ● A)Crie um método exibirInfo() que imprime no console todas as informações do produto.
    // ● B)Crie um método calcularValorTotalEmEstoque() que retorna um double. Este método deve calcular e retornar o valor total do produto em estoque (preço * quantidade).
    // ● C)Crie um método adicionarEstoque(int quantidade) que adiciona a quantidade informada ao estoque do produto.
    // ● D)Criar uma Classe de Teste com o método main. Dentro do main, instancie (crie) pelo menos dois objetos diferentes da classe Produto. Para cada produto, chame o método exibirInfo(). Calcule e imprima o valor total em estoque de um dos produtos. Adicione mais itens ao estoque de um dos produtos e exiba as informações novamente para ver a atualização.
    
public class Produto {
        // Atributos
         String nome;
         double preco;
         int quantidade;
    
        // Construtor
        public Produto(String nome, double preco, int quantidadeInicial) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidadeInicial;
        }
    
        // Métodos
        //A)
        public void exibirInfo() {
         System.out.println("Informações do Produto: ");
         System.out.println("Nome: " + nome);
         System.out.printf("Preço: R$ %.2f%n", preco); // Formata para duas casas decimais
         System.out.println("Quantidade em Estoque: " + quantidade);
         System.out.println("------------------------------");
        }
    
        public double calcularValorTotalEmEstoque() {
            double ValorTotal = preco * quantidade;
            return ValorTotal;
        }
        
        public int adicionarQuantidade(int novoEstoque) {
            quantidade += novoEstoque;
            return quantidade;
        }
}
