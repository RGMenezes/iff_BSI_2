package POO.Casa.Exercicio01.model;

public class Vendedor extends Empregado{
    private double valorVendas, comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao / 100;
    }

    public double getvalorVendas() {
        return valorVendas;
    }
    public void setvalorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(){
        return this.valorVendas * this.comissao + super.calcularSalario();
    }
}
