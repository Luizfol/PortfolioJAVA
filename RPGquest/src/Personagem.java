public class Personagem {
    private String nome;
    private int nivel;
    private int vida;
    private int experiencia;

    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = Math.max(1, nivel);
        this.vida = Math.max(1, vida);
        this.experiencia = 0;
    }

    public String getNome() { 
        return nome; }
    public int getVida() { 
        return vida; }
    public boolean estaVivo() { 
        return vida > 0; }

    public void receberDano(int dano) {
        if (dano > 0) vida = Math.max(0, vida - dano);
    }

    public void curar() {
        if (estaVivo()) vida = Math.min(100, vida + 15);
    }

    public void ganharExperiencia() {
        experiencia += 10;
    }

    public void atacar(Personagem alvo) {
        if (estaVivo() && alvo.estaVivo()) alvo.receberDano(10);
    }

    public void exibirStatus() {
        System.out.println(nome + " : Nível: " + nivel + " : Vida: " + vida
                + " : XP: " + experiencia + " : " + (estaVivo() ? "Vivo" : "Derrotado"));
    }
}
