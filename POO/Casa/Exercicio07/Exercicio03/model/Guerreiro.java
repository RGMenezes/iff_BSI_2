package POO.Casa.Exercicio07.Exercicio03.model;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 120, 15, 10);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.getAtaque() - alvo.getDefesa() / 3;
        if (dano > 0) {
            alvo.setVida(alvo.getVida() - dano);
            System.out.println(this.getNome() + " golpeou " + alvo.getNome() + " causando " + dano + " de dano.");
        } else {
            System.out.println(this.getNome() + " golpeou " + alvo.getNome() + " mas não causou dano.");
        }
    }

    @Override
    public String getTipo() {
        return "Guerreiro";
    }
}