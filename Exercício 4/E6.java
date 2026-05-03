//6 - Dado String[] nomes = {"Ana","Bruno","Alê","Aline","Clara"}, imprima apenas os que começam com ‘A’ usando foreach.
public class E6 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Alê", "Aline", "Clara"};

        System.out.println("Nomes que começam com 'A':");

        // Estrutura foreach: para cada 'nome' dentro do array 'nomes'
        for (String nome : nomes) {
            if (nome.startsWith("A")) {
                System.out.println(nome);
            }
        }
    }
}
