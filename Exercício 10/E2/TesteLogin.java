
/* 1. Crie uma classe de exceção chamada LoginInvalidoException que herda de Exception.
● Crie uma classe SistemaLogin com um atributo privado senhaSecreta
● O atributo senhaSecreta deve ter o valor default "123456" no construtor.
● Crie um método public void fazerLogin(String usuario, String senha) que deve lançar a
exceção LoginInvalidoException se a senha informada for diferente da senhaSecreta.
● No método main de uma classe de teste, peça para o usuário digitar o login e a senha.
● Chame o método fazerLogin dentro de um bloco try-catch e capture a sua exceção
personalizada, exibindo a mensagem "Acesso Negado: Credenciais incorretas". */
import java.util.Scanner;
public class TesteLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaLogin sistema = new SistemaLogin();

        System.out.println("--- Tela de Login ---");
        
        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        try {
            // Tenta executar o login
            sistema.fazerLogin(usuario, senha);
            
        } catch (LoginInvalidoException e) {
            // Captura a exceção personalizada e exibe a mensagem exata solicitada
            System.out.println("Acesso Negado: Credenciais incorretas");
        }

        scanner.close();
    }
}