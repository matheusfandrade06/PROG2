import java.util.Scanner;

public class AULA6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o 1º Nome: ");
        String nome1 = scanner.nextLine();
        int tamanho = nome1.length();

        System.out.printf("O nome: '%s', possui: %d Caracteres", nome1, tamanho);
        
        scanner.close();
    }
}
