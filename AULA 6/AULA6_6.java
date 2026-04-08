
import java.util.Scanner;

public class AULA6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma Frase: ");
        String frase = scanner.nextLine();
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int index = frase.indexOf(palavra);
        if (index != -1){
            System.out.printf("A palavra '%s' está presente na Frase. (indexOF = %d)", palavra, index);
        }
        else{
            System.out.printf("A Palavra '%s' não encontrada na Frase. (indexOF = %d)", palavra, index);
        }

    }
}
