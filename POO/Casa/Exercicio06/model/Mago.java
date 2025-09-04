package POO.Casa.Exercicio06.model;

public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int pontosVida, int mana) {
        super(nome, pontosVida);
        this.mana = mana;
    }

    @Override
    public void atacar() {
        System.out.println("O mago lança uma bola de fogo!");
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
}

// - Classe Mago
//  • Atributos extras:
//  - int mana
//  • Método sobrescrito:
//  - void atacar() → imprime 'O mago lança uma bola de fogo!'