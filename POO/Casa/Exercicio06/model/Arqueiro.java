package POO.Casa.Exercicio06.model;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome, int pontosVida) {
        super(nome, pontosVida);
    }

    @Override
    public void atacar() {
        System.out.println("O arqueiro atira uma flecha!");
    }
}

// - Classe Arqueiro
//  • Método sobrescrito:
//  - void atacar() → imprime 'O arqueiro atira uma flecha!'