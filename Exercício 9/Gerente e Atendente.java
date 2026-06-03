// Subclasse Gerente
class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }

    // Polimorfismo: adiciona o bônus de R$ 2000,00
    @Override
    public double getSalario() {
        return super.getSalario() + 2000.00;
    }

    @Override
    public String toString() {
        return super.toString() + " | Cargo: Gerente";
    }
}

// Subclasse Atendente
class Atendente extends Funcionario {
    private double comissao;

    public Atendente(String nome, String cpf, double salario, String dataNascimento, double comissao) {
        super(nome, cpf, salario, dataNascimento);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    // Polimorfismo: O salário final do atendente inclui a comissão
    @Override
    public double getSalario() {
        return super.getSalario() + this.comissao;
    }

    @Override
    public String toString() {
        return super.toString() + " | Cargo: Atendente (Comissão: R$ " + comissao + ")";
    }
}