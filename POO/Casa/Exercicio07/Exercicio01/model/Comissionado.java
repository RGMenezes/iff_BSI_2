package POO.Casa.Exercicio07.Exercicio01.model;

public class Comissionado extends Funcionario {
    private double totalVendas;
    private double taxaComissao;

    public Comissionado(String nome, String matricula, double totalVendas, double taxaComissao) {
        super(nome, matricula);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    public double getTaxaComissao() {
        return taxaComissao;
    }
    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularPagamento() {
        return totalVendas * taxaComissao;
    }
}