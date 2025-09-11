package POO.Aula.Exercicio05.model;

import java.util.*;

public class ControlePagamento {
    public static ArrayList<Pagamento> pag = new ArrayList<>();
    
    public static void incluirPagamento(Pagamento p){
        pag.add(p);
    }

    public static String mostrarTotalPagamento(){
        StringBuilder sb = new StringBuilder();
        double total = 0;

        for(Pagamento p : pag){
            sb.append(p.mostrarPagamento() + "\n");
            total += p.getTotalPagamento();
        }
        sb.append("\nO total geral de pagamentos é: " + total);

        return sb.toString();
    }
}