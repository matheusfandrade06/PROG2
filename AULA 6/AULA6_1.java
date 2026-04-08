import java.util.Scanner;

public class AULA6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o 1º Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite o 2º Nome: ");
        String nome2 = scanner.nextLine();

        if (nome1.equals(nome2) ){
          System.out.println("Os Nomes são iguais!" );
        }
        else{
            System.out.println("Os Nomes são diferentes! ");
        }
        
        scanner.close();
    }
}
