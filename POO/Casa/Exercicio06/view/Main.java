package POO.Casa.Exercicio06.view;

import java.util.*;

import POO.Casa.Exercicio06.model.*;

public class Main {
    public static void main(String[] args) {
        Personagem guerreiro = new Guerreiro("Aragorn", 100);
        Personagem arqueiro = new Arqueiro("Legolas", 80);
        Personagem mago = new Mago("Gandalf", 70, 200);

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(guerreiro);
        personagens.add(arqueiro);
        personagens.add(mago);

        for (Personagem personagem : personagens) {
            System.out.print(personagem.getNome() + " diz: ");
            personagem.atacar();
        }
    }
}

// - No método principal, criar uma lista de personagens e percorrê-la chamando atacar(),
// demonstrando polimorfismo