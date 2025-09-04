package POO.Casa.Exercicio05.view;

import java.util.ArrayList;
import java.util.List;

import POO.Casa.Exercicio05.model.Funcionario;
import POO.Casa.Exercicio05.model.FuncionarioAssalariado;
import POO.Casa.Exercicio05.model.FuncionarioHorista;
import POO.Casa.Exercicio05.model.FuncionarioComissao;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioAssalariado("João", 0, 3000.0));
        funcionarios.add(new FuncionarioHorista("Maria", 0, 160, 25.0));
        funcionarios.add(new FuncionarioComissao("Carlos", 1000.0, 50000.0, 5.0));

        for (Funcionario f : funcionarios) {
            System.out.println(
                f.getClass().getSimpleName() + ": " + 
                f.getNome() + " - Salário: " + f.calcularSalario()
            );
        }
    }
}


// - No método principal, criar uma lista de funcionários e demonstrar o polimorfismo ao
// calcular os salários.