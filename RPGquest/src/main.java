import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do personagem: ");
        String nome = scanner.nextLine();
        

        System.out.print("Classe (1 - Guerreiro, 2 - Mago): ");
        String classe = scanner.nextLine();
        Personagem jogador = classe.equals("2") ? new Mago(nome) : new Guerreiro(nome);
        Personagem inimigo = classe.equals("2") ? new Guerreiro("Inimigo") : new Mago("Inimigo");

        while (jogador.estaVivo() && inimigo.estaVivo()) {
            
            jogador.exibirStatus();
            inimigo.exibirStatus();
            System.out.print("1 - Combater | 2 - Curar | 0 - Sair: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("0")) break;
            if (opcao.equals("1")) {
                jogador.atacar(inimigo);
                jogador.ganharExperiencia();
            } else if (opcao.equals("2")) {
                jogador.curar();
                System.out.println(nome + " recuperou vida!");
            } else {
                System.out.println("Opção inválida.");
                continue;
            }

            if (inimigo.estaVivo()) inimigo.atacar(jogador);
        }

        System.out.println("\n--- FIM ---");
        jogador.exibirStatus();
        inimigo.exibirStatus();
        if (!inimigo.estaVivo()) System.out.println("Vitória!");
        else if (!jogador.estaVivo()) System.out.println("Derrota!");
        else System.out.println("Jogo encerrado.");
        scanner.close();

        System.out.println("Teste fork");
    }
}
