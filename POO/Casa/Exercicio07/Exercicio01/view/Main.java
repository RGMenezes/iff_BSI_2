package POO.Casa.Exercicio07.Exercicio01.view;

import java.util.ArrayList;

import POO.Casa.Exercicio07.Exercicio01.model.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Assalariado("Ana", "001", 3000.00));
        funcionarios.add(new Comissionado("Bruno", "002", 50000.00, 0.10));
        funcionarios.add(new Horista("Carla", "003", 160, 20.00));
        double totalPagamento = 0;

        for (Funcionario f : funcionarios) {
            totalPagamento += f.calcularPagamento();
        }

        System.out.printf("Pagamento total: R$ %.2f%n", totalPagamento);
    }
}

// Exercício 1 – Sistema de Pagamento de Funcionários (Interface + Polimorfismo)
// Descrição:
// Crie um sistema de pagamento onde existam diferentes tipos de funcionários:
// • Assalariado (recebe um valor fixo mensal)
// • Comissionado (recebe comissão por vendas)
// • Horista (recebe por hora trabalhada)
// Requisitos:
// • Crie uma interface Pagavel com o método double calcularPagamento().
// • Crie uma classe abstrata Funcionario com atributos básicos (nome, matrícula).
// • Cada tipo de funcionário deve herdar de Funcionario e implementar Pagavel.
// • Use polimorfismo para calcular o pagamento total de uma lista de funcionários.