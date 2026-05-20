
import java.util.ArrayList;
import java.util.Scanner;

public class E1{
    public static void main(String[] args){
        int opcao = 0;
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> lista = new ArrayList<>(); // lista fora do 'DO' pra não resetar
        lista.add("leite");
        lista.add("Ovo");
        lista.add("Cuscuz");
        do{
         
         System.out.print("\n --- Lista de Compras ---\n");
         System.out.println("1. Adicionar item");
         System.out.println("2. Listar itens");
         System.out.println("3. Remover item");
         System.out.println("4. Sair");
         System.out.print("Escolha uma opção: ");
         try{
          opcao = scanner.nextInt();
          scanner.nextLine();
          switch (opcao) {
            case 1:
                System.out.print("Digite o nome do item: ");
                String novoItem = scanner.nextLine();
                lista.add(novoItem);
                System.out.println("\"" + novoItem + "\" adicionado com sucesso!");
                break;

            case 2:
                System.out.println("\n--- Itens na Lista ---");
                if (lista.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else {
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + ". " + lista.get(i));
                    }
                }
                break;

            case 3:
                if (lista.isEmpty()) {
                    System.out.println("A lista está vazia. Não há nada para remover.");
                } else {
                    System.out.print("Digite o índice do item que deseja remover: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    if (indice >= 0 && indice < lista.size()) { //mecanismo pra evitar erro por digitção inválida
                        String removido = lista.remove(indice);
                        System.out.println("\"" + removido + "\" foi removido.");
                    } else {
                        System.out.println("Índice inválido! Verifique a lista novamente.");
                    }
                }
                break;

            case 4:
                System.out.println("Encerrando o programa. Até mais!");
                break;
  
            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
         }//Chave(}) do 'SWITCH'
        }//chave do try
         catch (Exception e) {
          System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
          scanner.nextLine(); // Limpa o buffer
          opcao = 0; // Reseta a opção para continuar o loop
          } 
    }//chave do 'DO'
     while (opcao !=4);
    }
}