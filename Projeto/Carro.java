<<<<<<< HEAD
public class Carro extends Veiculo {
    private int numPortas;
    private boolean temArCondicionado;

    public Carro(String placa, String marca, String modelo, double precoDiaria, int numPortas, boolean temArCondicionado) {
        super(placa, marca, modelo, precoDiaria);
        this.numPortas = numPortas;
        this.temArCondicionado = temArCondicionado;
    }

    @Override // uso do Polimorfismo. O método 'exibirDetalhes' muda conforme a classe(neste caso, Carro altera a informação exibida, explicitando se há a presença de ar-condicionado e o número de portas)
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("   -> [CARRO] Portas: " + numPortas + " | Ar-Condicionado: " + (temArCondicionado ? "Sim" : "Não")+" Possui");
    }

    // Getters e Setters
    public int getNumPortas() { return numPortas; }
    public void setNumPortas(int numPortas) { this.numPortas = numPortas; }

    public boolean isTemArCondicionado() { return temArCondicionado; }
    public void setTemArCondicionado(boolean temArCondicionado) { this.temArCondicionado = temArCondicionado; }
=======
public class Carro extends Veiculo {
    private int numPortas;
    private boolean temArCondicionado;

    public Carro(String placa, String marca, String modelo, double precoDiaria, int numPortas, boolean temArCondicionado) {
        super(placa, marca, modelo, precoDiaria);
        this.numPortas = numPortas;
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("   -> [CARRO] Portas: " + numPortas + " | Ar-Condicionado: " + (temArCondicionado ? "Sim" : "Não"));
    }

    // Getters e Setters
    public int getNumPortas() { return numPortas; }
    public void setNumPortas(int numPortas) { this.numPortas = numPortas; }

    public boolean isTemArCondicionado() { return temArCondicionado; }
    public void setTemArCondicionado(boolean temArCondicionado) { this.temArCondicionado = temArCondicionado; }
>>>>>>> 5b9326cb4180cd97c8996eb71cdd88af2223bdd9
}