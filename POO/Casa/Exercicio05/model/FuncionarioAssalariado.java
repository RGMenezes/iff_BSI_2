package POO.Casa.Exercicio05.model;

public class FuncionarioAssalariado extends Funcionario {
    private double salarioFixo;

    public FuncionarioAssalariado(String nome, double salarioBase, double salarioFixo) {
        super(nome, salarioBase);
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo;
    }
}

// FuncionarioAssalariado (salário fixo)

// - Classe FuncionarioAssalariado
//  • Atributos:
//  - double salarioFixo
//  • Método sobrescrito:
//  - double calcularSalario() → salarioFixo