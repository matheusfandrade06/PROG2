import java.util.Scanner;
// 3) Leia uma palavra e mostre quantos caracteres ela possui usando length()
public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o 1º Nome: ");
        String nome1 = scanner.nextLine();
        int tamanho = nome1.length();

        System.out.printf("O nome: '%s', possui: %d Caracteres", nome1, tamanho);
        
        scanner.close();
    }
}
