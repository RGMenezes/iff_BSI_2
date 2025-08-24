package POO.Casa.Exercicio04.view;

import POO.Casa.Exercicio04.model.Aniversario;
import POO.Casa.Exercicio04.model.CartaoWeb;
import POO.Casa.Exercicio04.model.DiaDosNamorados;
import POO.Casa.Exercicio04.model.Natal;

public class Main {
    public static void main(String[] args) {
        CartaoWeb[] cartoes = new CartaoWeb[3];
        
        cartoes[0] = new DiaDosNamorados("Juliana");
        cartoes[1] = new Natal("Família");
        cartoes[2] = new Aniversario("Roberto");
        
        for (CartaoWeb cartao : cartoes) {
            cartao.showMessage();
        }
    }
}