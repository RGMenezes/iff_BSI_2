package POO.Casa.Exercicio01.view;

import POO.Casa.Exercicio01.model.Administrador;
import POO.Casa.Exercicio01.model.Empregado;
import POO.Casa.Exercicio01.model.Fornecedor;
import POO.Casa.Exercicio01.model.Operario;
import POO.Casa.Exercicio01.model.Vendedor;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Teste da Classe Fornecedor ---");
        Fornecedor fornecedor = new Fornecedor(
            "Empresa ABC",
            "Rua das Flores, 123",
            "98765-4321"
        );
        fornecedor.setValorCredito(5000.00);
        fornecedor.setValorDivida(1500.00);

        System.out.println("Fornecedor: " + fornecedor.getNome());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Crédito: R$ " + String.format("%.2f", fornecedor.getValorCredito()));
        System.out.println("Dívida: R$ " + String.format("%.2f", fornecedor.getValorDivida()));
        System.out.println("Saldo: R$ " + String.format("%.2f", fornecedor.obterSaldo()));

        System.out.println("\n--- Teste da Classe Empregado ---");
        Empregado empregado = new Empregado(
            "João Silva",
            "Av. Principal, 456",
            "12345-6789",
            101,
            3000.00,
            15.0
        );
        System.out.println("Empregado: " + empregado.getNome());
        System.out.println("Salário Líquido (sem extras): R$ " + String.format("%.2f", empregado.calcularSalario()));

        System.out.println("\n--- Teste da Classe Administrador ---");
        Administrador admin = new Administrador(
            "Maria Souza",
            "Rua do Sol, 789",
            "11111-2222",
            202,
            5000.00,
            15.0,
            800.00
        );
        System.out.println("Administrador: " + admin.getNome());
        System.out.println("Ajuda de Custo: R$ " + String.format("%.2f", admin.getAjudaDeCusto()));
        System.out.println("Salário Líquido (com ajuda de custo): R$ " + String.format("%.2f", admin.calcularSalario()));

        System.out.println("\n--- Teste da Classe Operario ---");
        Operario operario = new Operario(
            "Pedro Santos",
            "Av. Industrial, 321",
            "33333-4444",
            303,
            2500.00,
            15.0,
            10000.00,
            5.0     
        );
        System.out.println("Operário: " + operario.getNome());
        System.out.println("Valor de Produção: R$ " + String.format("%.2f", operario.getvalorProducao()));
        System.out.println("Salário Líquido (com comissão): R$ " + String.format("%.2f", operario.calcularSalario()));

        System.out.println("\n--- Teste da Classe Vendedor ---");
        Vendedor vendedor = new Vendedor(
            "Ana Oliveira",
            "Estrada Velha, 654",
            "55555-6666",
            404,
            2800.00,
            15.0,
            15000.00,
            7.0
        );
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Valor das Vendas: R$ " + String.format("%.2f", vendedor.getvalorVendas()));
        System.out.println("Salário Líquido (com comissão): R$ " + String.format("%.2f", vendedor.calcularSalario()));
    }
}