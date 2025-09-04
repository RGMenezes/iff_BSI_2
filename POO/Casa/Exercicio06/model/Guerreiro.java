package POO.Casa.Exercicio06.model;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int pontosVida) {
        super(nome, pontosVida);
    }

    @Override
    public void atacar() {
        System.out.println("O guerreiro ataca com sua espada!");
    }
}

// Classe Guerreiro
//  • Método sobrescrito:
//  - void atacar() → imprime 'O guerreiro ataca com sua espada!'