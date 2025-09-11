package POO.Aula.Exercicio05.model;

public class Fatura implements Pagamento{
    private String numParte, descricaoParte;
    private int quantidade;
    private double precoPorItem;

    public Fatura(String numParte, String descricaoParte, int quantidade, double precoPorItem) {
        this.numParte = numParte;
        this.descricaoParte = descricaoParte;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
    }

    public String getNumParte() {
        return numParte;
    }
    public void setNumParte(String numParte) {
        this.numParte = numParte;   
    }

    public String getDescricaoParte() {
        return descricaoParte;
    }
    public void setDescricaoParte(String descricaoParte) {
        this.descricaoParte = descricaoParte;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }
    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    @Override
    public double getTotalPagamento() {
        return this.quantidade * 1.2 * this.precoPorItem;
    }

    @Override
    public String mostrarPagamento() {
        return "O total da fatura é: " + this.getTotalPagamento();
    }
}
