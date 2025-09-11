package POO.Aula.Exercicio05.view;

import javax.swing.JOptionPane;

import POO.Aula.Exercicio05.model.*;

public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new Fatura("123", "Cadeira", 2, 20);
        Pagamento p2 = new Empregado("Rafael", "Silva", "001", 3000);

        ControlePagamento.incluirPagamento(p1);
        ControlePagamento.incluirPagamento(p2);

        JOptionPane.showMessageDialog(null, ControlePagamento.mostrarTotalPagamento());
    }
}
