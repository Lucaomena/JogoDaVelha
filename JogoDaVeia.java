package jogodaveia;

import java.util.Scanner;

public class JogoDaVeia {

    static Jogador jogador1 = new Jogador();
    static Jogador jogador2 = new Jogador();

    public static void main(String[] args) {

        boolean continuarJogo = true;

        while (continuarJogo) {
            iniciarJogo();
            continuarJogo = false;
        }

    }
//metodo

    public static void iniciarJogo() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Jogador 1, digite seu nome: ");
        jogador1.nome = entrada.next();

        System.out.print("Jogador 2, digite seu nome: ");
        jogador2.nome = entrada.next();

        for (boolean ok = false; ok == false;) {

            System.out.print(jogador1.nome + ", DIGITE 1 para X ou 2 para O ");
            String input = entrada.next();
            //estrutura de decisão
            if (input.equals("1")) {
                jogador1.simbolo = 'X';
                jogador2.simbolo = 'O';
                ok=true;
            } else if (input.equals("2")) {
                jogador1.simbolo = 'O';
                jogador2.simbolo ='X';
                ok=true;
            } else {

            }

        }

    }
}
