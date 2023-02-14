package Aula64ate70.Teste;

import Aula64ate70.Dominio.Jogador;
import Aula64ate70.Dominio.Time;

public class JogadorTeste02 {

    //associação unidirecioal
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        jogador1.imprime();


        //associamos o jogador 1 ao time
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
