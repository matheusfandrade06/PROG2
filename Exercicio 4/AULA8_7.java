
import java.util.Scanner;

public class AULA8_7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = leitor.next();
        
        String invertida = "";

        // Percorre o índice do último(length-1) até o primeiro(0)
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + invertida);

        leitor.close();
    }
}
