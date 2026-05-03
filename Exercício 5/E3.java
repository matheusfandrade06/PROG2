// 3. Crie um método chamado elementoExiste que recebe 2 parâmetros: um array de strings (String[]) e uma string de busca. O método deve retornar true se a string de busca estiver presente no array e false caso contrário.
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de elementos na lista: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        String[] lista = new String[n];
        System.out.println("Digite os elementos da lista:");
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextLine();
        }

        System.out.print("Digite o elemento a ser buscado: ");
        String busca = scanner.nextLine();
            if (elementoExiste(lista, busca)) {
                System.out.println("O elemento '" + busca + "' existe na lista.");
            } else {
                System.out.println("O elemento '" + busca + "' não existe na lista.");
            }
        
    }
        public static boolean elementoExiste(String[] lista, String busca) {
        if (lista == null || busca == null) return false;
    
    for (String elemento : lista) {
        if (busca.equals(elemento)) {
            return true;
        }
    }
    return false;
}
}
