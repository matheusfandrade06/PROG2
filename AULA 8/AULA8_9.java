import java.util.Scanner;

public class AULA8_9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // Senha pré-definida
        String senhaCorreta = "1234";
        String senhaDigitada = "";

        // O laço continua enquanto a senha digitada for DIFERENTE da correta
        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = leitor.next();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        }

        System.out.println("Acesso permitido.");
        
        leitor.close();
    }
}
