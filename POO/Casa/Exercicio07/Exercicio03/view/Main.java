package POO.Casa.Exercicio07.Exercicio03.view;

import POO.Casa.Exercicio07.Exercicio03.model.*;

public class Main {
    public static void main(String[] args) {
        Personagem mago = new Mago("Gandalf");
        Personagem guerreiro = new Guerreiro("Aragorn");
        Personagem arqueiro = new Arqueiro("Legolas");
        Personagem[] personagens = {mago, guerreiro, arqueiro};

        for (Personagem atacante : personagens) {
            for (Personagem alvo : personagens) {
                if (atacante != alvo) {
                    atacante.atacar(alvo);
                    System.out.println(alvo.getNome() + " agora tem " + alvo.getVida() + " de vida.\n");
                }
            }
        }

        for (Personagem p : personagens) {
            System.out.println(p.getNome() + " é um " + p.getTipo() + " com " + p.getVida() + " de vida.");
        }
    }
}

// Exercício 3 – Jogo de Personagens (Herança + Classe Abstrata + Polimorfismo)
// Descrição:
// Crie um jogo com diferentes tipos de personagens: magos, guerreiros e arqueiros.
// Requisitos:
// • Crie uma classe abstrata Personagem com métodos como atacar(), defender() e
// getTipo().
// • Cada subclasse (Mago, Guerreiro, Arqueiro) deve sobrescrever os métodos com
// comportamentos diferentes.
// • Use uma lista de Personagem e demonstre o uso de polimorfismo nas batalhas.