package POO.Aula.Exercicio02.view;

import POO.Aula.Exercicio02.model.Nacional;
import POO.Aula.Exercicio02.model.Importado;
import POO.Aula.Exercicio02.model.ControleVendas;

public class Main {
    public static void main(String[] args) {
        Nacional prodNac = new Nacional("001", "Café", "RJ");
        prodNac.setPreco(10.0);
        Importado prodImp = new Importado("002", "Vinho", "Portugal");
        prodImp.setPreco(50.0);

        System.out.println("Preço final Nacional: " + prodNac.calcularPrecoFinal()); // Esperado: 11.0
        System.out.println("Preço final Importado: " + prodImp.calcularPrecoFinal()); // Esperado: 65.0

        ControleVendas controle = new ControleVendas();
        controle.registrarVenda(prodNac);
        controle.registrarVenda(prodImp);

        System.out.println("\nProdutos vendidos:");
        System.out.println(controle.mostrarProdutosVendidos());

        try {
            Nacional prodErro = new Nacional("003", "Feijão", "SP");
            prodErro.setPreco(0);
            System.out.println(prodErro.calcularPrecoFinal());
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}