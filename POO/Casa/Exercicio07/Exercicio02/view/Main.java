package POO.Casa.Exercicio07.Exercicio02.view;

import java.util.Scanner;

import POO.Casa.Exercicio07.Exercicio02.model.*;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", 1954);
        DVD dvd1 = new DVD("Inception", 2010);
        Revista revista1 = new Revista("National Geographic", 2023);
        
        int opcao = 0;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Emprestar Livro");
            System.out.println("2. Devolver Livro");
            System.out.println("3. Emprestar DVD");
            System.out.println("4. Devolver DVD");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    livro1.emprestar();
                    break;
                case 2:
                    livro1.devolver();
                    break;
                case 3:
                    dvd1.emprestar();
                    break;
                case 4:
                    dvd1.devolver();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        System.out.println("\nRevista: ");
        System.out.println("Título: " + revista1.getTitulo() + ", Ano: " + revista1.getAno());
    }
}

// Exercício 2 – Sistema de Biblioteca com Empréstimos (Herança + Interface)
// Descrição:
// Implemente um sistema de controle de empréstimos para uma biblioteca.
// Requisitos:
// • Crie uma classe abstrata ItemBiblioteca com os atributos titulo, ano,
// emprestado.
// • Crie subclasses Livro, Revista e DVD.
// • Crie uma interface Emprestavel com os métodos emprestar() e devolver().
// • Somente Livro e DVD implementam a interface Emprestavel (revistas não podem ser
// emprestadas).
// • Faça um menu para testar empréstimos e devoluções com polimorfismo.