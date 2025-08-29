package POO.Aula.Exercicio04.view;

import java.util.Scanner;
import POO.Aula.Exercicio04.model.PolReg;
import POO.Aula.Exercicio04.model.TrianguloEq;
import POO.Aula.Exercicio04.model.Quadrado;

public class MainPol {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo de polígono:");
        // System.out.println("1 - Polígono Regular");
        System.out.println("1 - Triângulo Equilátero");
        System.out.println("2 - Quadrado");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        System.out.print("Informe o tamanho do lado: ");
        int tamanhoDoLado = sc.nextInt();

        PolReg poligono = null;

        switch (opcao) {
            // case 1:
            //     System.out.print("Informe o número de lados: ");
            //     int numeroDeLados = sc.nextInt();
            //     poligono = new PolReg(numeroDeLados, tamanhoDoLado);
            //     break;
            case 1:
                poligono = new TrianguloEq(tamanhoDoLado);
                break;
            case 2:
                poligono = new Quadrado(tamanhoDoLado);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Perímetro: " + poligono.calculoDoPerimetro());
        System.out.println("Ângulo interno: " + poligono.calculoDoAnguloInterno());
        System.out.println("Área: " + poligono.calculoDaArea());
    }
}
        