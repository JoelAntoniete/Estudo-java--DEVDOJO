package Aula64ate70.Teste;

import Aula64ate70.Dominio.Jogador;
import Aula64ate70.Dominio.Time;

public class JogadorTest03 {
    // Associação bidirecional
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("eleção Brasileira");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Time ---");
        time.imprime();


    }
}
