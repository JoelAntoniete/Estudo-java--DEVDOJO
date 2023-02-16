package Aula64ate70.Teste;

import Aula64ate70.Dominio.Jogador;

public class JogadorTeste01 {
    //Aula sobre associação
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");

        // um Array com objetod para guardar os jogadores
        Jogador[] jogadores = { jogador1, jogador2, jogador3};
        for (Jogador jogador :jogadores) {
            jogador.imprime();
        }
    }
}
