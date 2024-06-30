public class ContaPagar {
    private double valor;
    private String descricao;

    public ContaPagar(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
