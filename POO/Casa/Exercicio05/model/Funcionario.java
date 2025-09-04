package POO.Casa.Exercicio05.model;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}


// - Criar uma classe abstrata Funcionario com atributos nome, salarioBase e um método
// abstrato calcularSalario().

// - Classe Abstrata Funcionario
//  • Atributos:
//  - String nome
//  - double salarioBase
//  • Métodos:
//  - abstract double calcularSalario()
//  - String getNome(), void setNome(String nome)
//  - double getSalarioBase(), void setSalarioBase(double salarioBase)