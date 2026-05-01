
import java.util.Scanner;

public class AULA6_4 {
    //Utilizando os métodos stringOF, indexOf e substring
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra = "programação";
        String sub1 = palavra.substring(0,7);
        String sub2 = palavra.substring(7);
        System.out.printf("1º Substring: %s\n2º Substring: %s", sub1, sub2);


    }
}
