package POO.Casa.Exercicio07.Exercicio01.model;

public class Assalariado extends Funcionario {
    private double salarioMensal;

    public Assalariado(String nome, String matricula, double salarioMensal) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }
}