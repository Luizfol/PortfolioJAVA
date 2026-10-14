public class Mago extends Personagem {
    private String magia;

    public Mago(String nome) {
        super(nome, 1, 100);
        this.magia = "Fogo";
    }

    @Override
    public void atacar(Personagem alvo) {
        
        System.out.println(getNome() + " lançou magia de " + magia + "!");
        alvo.receberDano(15);
    }
}
