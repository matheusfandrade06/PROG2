import java.util.Scanner;

public class  AULA5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criar objeto scanner
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 16){
          System.out.println("Pode Votar! ");
        }
        else{
            System.out.println("Não Pode Votar! ");
        }
        
        scanner.close();
    }
}