public class Locacao {
    private static int geradorId = 1;
    private int id;
    private Veiculo veiculo;
    private Cliente cliente;
    private int quantidadeDias;
    private double valorTotal;

    public Locacao(Veiculo veiculo, Cliente cliente, int quantidadeDias) {
        this.id = geradorId++;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.quantidadeDias = quantidadeDias;
        this.valorTotal = calcularValorTotal();
    }

    public double calcularValorTotal() {
        double total = veiculo.getPrecoDiaria() * quantidadeDias;
        return total;
    }

    public void gerarRecibo() {
        System.out.println("----------------------------------------");
        System.out.println("RECIBO DE LOCAÇÃO - ID: " + id);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Veículo: " + veiculo.getMarca() + " " + veiculo.getModelo() + " (Placa: " + veiculo.getPlaca() + ")");
        System.out.println("Dias contratados: " + quantidadeDias);
        System.out.println("Valor Final: R$" + valorTotal);
        System.out.println("----------------------------------------");
    }

    // Getters
    public int getId() { return id; }
    public Veiculo getVeiculo() { return veiculo; }
    public Cliente getCliente() { return cliente; }
    public int getQuantidadeDias() { return quantidadeDias; }
    public double getValorTotal() { return valorTotal; }
}