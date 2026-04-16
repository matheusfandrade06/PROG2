public class AULA8_6 {
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
