package jogo.src;

public class personagem {
    private int vida;
    String nome;

    public personagem(String nomeescolhido){
        this.nome = nomeescolhido;
        this.vida= 100;
        System.out.println("spawn");



    }

void receberDano (int dano){

    vida = vida - dano;
    if (vida <= 0){
        vida = 0;
        System.out.println("vasco");
    }

}



    
}
 