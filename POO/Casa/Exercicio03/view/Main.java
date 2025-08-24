package POO.Casa.Exercicio03.view;

import java.util.ArrayList;
import java.util.List;

import POO.Casa.Exercicio03.model.*;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana Paula", "G-101", 5000.00);
        Assistente assistente = new Assistente("Pedro Dutra", "A-202", 2000.00);
        Vendedor vendedor = new Vendedor("Carlos Lima", "V-303", 2000.00, 500.00);
        
        List<Funcionario> folhaSalarial = new ArrayList<>();
        folhaSalarial.add(gerente);
        folhaSalarial.add(assistente);
        folhaSalarial.add(vendedor);
        
        double totalFolha = 0.0;
        
        System.out.println("--- Folha Salarial Mensal ---");
        
        for (Funcionario f : folhaSalarial) {
            double salario = f.calculaSalario();
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário Calculado: R$ " + String.format("%.2f", salario));
            System.out.println("---------------------------------");
            
            totalFolha += salario;
        }
        
        System.out.println("Valor Total da Folha Salarial: R$ " + String.format("%.2f", totalFolha));
    }
}