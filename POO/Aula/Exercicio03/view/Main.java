package POO.Aula.Exercicio03.view;

import POO.Aula.Exercicio03.model.Midia;
import POO.Aula.Exercicio03.model.CD;
import POO.Aula.Exercicio03.model.DVD;

public class Main {
    public static void main(String[] args) {
        Midia m1 = new Midia(1, 20.0, "Midia Genérica");
        m1.printDados();
        System.out.println();

        CD cd1 = new CD(2, 30.0, "CD Rock", 12);
        cd1.printDados();
        System.out.println();

        DVD dvd1 = new DVD(3, 40.0, "DVD Filme", 20);
        dvd1.printDados();
        System.out.println();

        CD cd2 = new CD();
        cd2.inserirDados(4, 25.0, "CD Pop", 10);
        cd2.printDados();
        System.out.println();

        DVD dvd2 = new DVD();
        dvd2.inserirDados(5, 35.0, "DVD Show", 15);
        dvd2.printDados();
    }
}