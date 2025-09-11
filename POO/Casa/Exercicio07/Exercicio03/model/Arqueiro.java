package POO.Casa.Exercicio07.Exercicio03.model;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 100, 20, 7);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.getAtaque() - alvo.getDefesa() / 3;
        if (dano > 0) {
            alvo.setVida(alvo.getVida() - dano);
            System.out.println(this.getNome() + " atirou uma flecha em " + alvo.getNome() + " causando " + dano + " de dano.");
        } else {
            System.out.println(this.getNome() + " atirou uma flecha em " + alvo.getNome() + " mas não causou dano.");
        }
    }

    @Override
    public String getTipo() {
        return "Arqueiro";
    }
}
