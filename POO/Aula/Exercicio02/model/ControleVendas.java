package POO.Aula.Exercicio02.model;

import java.util.ArrayList;

public class ControleVendas {

    public static ArrayList<Produto> vendas = new ArrayList<>();

    public void registrarVenda(Produto p) {
        vendas.add(p);
    }

    public String mostrarProdutosVendidos() {
        StringBuilder sb = new StringBuilder();
        for (Produto p : vendas) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}