package POO.Casa.Exercicio01.model;

public class Operario extends Empregado{
    private double valorProducao, comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao / 100;
    }

    public double getvalorProducao() {
        return valorProducao;
    }
    public void setvalorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(){
        return this.valorProducao * this.comissao + super.calcularSalario();
    }
}

