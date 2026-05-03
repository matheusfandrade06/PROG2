import java.util.Scanner;
// 2) Leia duas palavras e informe se elas são iguais ignorando letras maiúsculas e minúsculas, usando equalsIgnoreCase()
public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o 1º Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite o 2º Nome: ");
        String nome2 = scanner.nextLine();

        if (nome1.equalsIgnoreCase(nome2) ){
          System.out.println("Os Nomes são iguais! (Ignorando a diferença de Letras Maiusculas)" );
        }
        else{
            System.out.println("Os Nomes são diferentes! (Mesmo Ignorando a diferença de Letras Maiusculas) ");
        }
        
        scanner.close();
    }
}
