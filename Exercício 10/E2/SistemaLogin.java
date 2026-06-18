public class SistemaLogin {
    private String senhaSecreta;

    // valor padrão da senha
    public SistemaLogin() {
        this.senhaSecreta = "123456";
    }

    public void fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        if (!this.senhaSecreta.equals(senha)) {
            throw new LoginInvalidoException("Senha incorreta inserida pelo usuário.");
        }
        
        System.out.println("Login realizado com sucesso!");
    }
}