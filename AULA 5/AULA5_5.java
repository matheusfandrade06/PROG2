import java.util.Scanner;

public class  AULA5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criar objeto scanner
        
        System.out.print("Digite o ingresso desejado: ");
        String ingresso = scanner.nextLine();

        if (ingresso.equals("inteiro") ){
          System.out.println("Valor da Compra: R$40,00" );
        }
        else if (ingresso.equals("meia-entrada") || ingresso.equals("meia")){
          System.out.println("Valor da Compra: R$20,00" );
        }
        else{
            System.out.println("Tipo de ingresso inválido! ");
        }
        
        scanner.close();
    }
}