package POO.Aula.Exercicio04.view;

import POO.Aula.Exercicio04.model.Complexo;
import POO.Aula.Exercicio04.model.Real;

public class MainNum {
    public static void main(String[] args) {
        Complexo c = new Complexo(3, 4);
        Real r = new Real(-5);

        System.out.println("-- Complexo --");
        System.out.println("Módulo: " + c.modulo());
        System.out.println("Ângulo: " + c.angulo());

        System.out.println("\n-- Real --");
        System.out.println("Sinal: " + r.sinal());
    }
}