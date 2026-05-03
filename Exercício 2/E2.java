import java.util.Scanner;
//2)Leia pelo terminal a idade de uma pessoa e informe:
// A) “Pode votar” se a idade for maior ou igual a 16;
// B) “Não pode votar” se a idade for menor que 16.
public class  E2 {
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