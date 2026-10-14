public class Guerreiro extends Personagem {
    private String arma;

    public Guerreiro(String nome) {
        super(nome, 1, 100);
        this.arma = "Espada";
    }

    @Override
    public void atacar(Personagem alvo) {
        
        System.out.println(getNome() + " atacou com " + arma + "!");
        alvo.receberDano(20);
    }
}
