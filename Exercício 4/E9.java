import java.util.Scanner;
//9 - Crie uma senha pré-definida (ex: "1234"). Peça ao usuário para digitar a senha. Use um laço while para continuar pedindo a senha até que ele acerte. Quando acertar, exiba uma mensagem de "Acesso permitido".
public class E9 {
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
