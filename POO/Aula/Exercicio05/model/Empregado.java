package POO.Aula.Exercicio05.model;

public class Empregado implements Pagamento {
    private String firstName, lastName, matricula;
    private double salario;

    public Empregado(String firstName, String lastName, String matricula, double salario) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    };

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getTotalPagamento() {
        return this.salario + 1000;
    }

    @Override
    public String mostrarPagamento() {
        return "O total do pagamento do empregado " + this.firstName + " " + this.lastName + " é: " + this.getTotalPagamento();
    }
}