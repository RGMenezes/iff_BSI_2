package POO.Aula.Exercicio04.view;

import java.util.Scanner;
import POO.Aula.Exercicio04.model.Pessoa;
import POO.Aula.Exercicio04.model.Aluno;

public class MainCol {
    public static void main(String[] args) {
        @SuppressWarnings("resource") 
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa;

        System.out.println("Deseja instanciar:");
        System.out.println("1 - Pessoa");
        System.out.println("2 - Aluno");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        if (opcao == 2) {
            System.out.print("Nome do curso: ");
            String curso = sc.nextLine();
            pessoa = new Aluno(nome, idade, curso);
        } else {
            pessoa = new Pessoa(nome, idade);
        }

        System.out.println("\n--- Dados ---");
        pessoa.mostrarDados();
    }
}