package POO.Casa.Exercicio07.Exercicio01.model;

public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String matricula, double horasTrabalhadas, double valorHora) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }
}