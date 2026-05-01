import java.util.Scanner;

public class AULA8_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = leitor.nextInt();

        if (idade < 16) {
            System.out.println("Você ainda não pode votar.");
        } 
        else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Seu voto é facultativo (opcional).");
        } 
        else {
            System.out.println("Seu voto é obrigatório.");
        }

        leitor.close();
    }
}
