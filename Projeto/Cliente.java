public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf.replaceAll("[^0-9]", "");
        this.telefone = telefone;
    }
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + " | CPF: " + cpf + " | Telefone: " + telefone);
    }
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    
    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ")";
    }
}