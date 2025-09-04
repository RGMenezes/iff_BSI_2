package POO.Casa.Exercicio05.model;

public class FuncionarioComissao extends Funcionario {
    private double totalVendas;
    private double percentualComissao;

    public FuncionarioComissao(String nome, double salarioBase, double totalVendas, double percentualComissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (totalVendas * percentualComissao / 100);
    }
    
}


// FuncionarioComissionado (totalVendas, percentualComissao).

// - Classe FuncionarioComissionado
//  • Atributos:
//  - double totalVendas
//  - double percentualComissao
//  • Método sobrescrito:
//  - double calcularSalario() → salarioBase + (totalVendas * percentualComissao)