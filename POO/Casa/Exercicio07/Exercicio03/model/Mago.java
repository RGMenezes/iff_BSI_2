package POO.Casa.Exercicio07.Exercicio03.model;

public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80, 25, 5);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.getAtaque() - alvo.getDefesa() / 3;
        if (dano > 0) {
            alvo.setVida(alvo.getVida() - dano);
            System.out.println(this.getNome() + " lançou um feitiço em " + alvo.getNome() + " causando " + dano + " de dano.");
        } else {
            System.out.println(this.getNome() + " lançou um feitiço em " + alvo.getNome() + " mas não causou dano.");
        }
    }

    @Override
    public String getTipo() {
        return "Mago";
    }
}