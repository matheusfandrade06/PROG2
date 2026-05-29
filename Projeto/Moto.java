// Moto.java
public class Moto extends Veiculo {
    private int cilindradas;
    private boolean temPartidaEletrica;

    public Moto(String placa, String marca, String modelo, double precoDiaria, int cilindradas, boolean temPartidaEletrica) {
        super(placa, marca, modelo, precoDiaria);
        this.cilindradas = cilindradas;
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("   -> [MOTO] Cilindradas: " + cilindradas + "cc | Partida Elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
    }

    // Getters e Setters
    public int getCilindradas() { return cilindradas; }
    public void setCilindradas(int cilindradas) { this.cilindradas = cilindradas; }

    public boolean isTemPartidaEletrica() { return temPartidaEletrica; }
    public void setTemPartidaEletrica(boolean temPartidaEletrica) { this.temPartidaEletrica = temPartidaEletrica; }
}