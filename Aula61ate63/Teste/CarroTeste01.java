package Aula61.Teste;

import Aula61.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        //modificador static
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("mercerdes",275);
        Carro c3 = new Carro("Audi", 290);

        /*
        transformando a velocidade limite em static, quando alterarmos ela,
        ela ira mudar para toda classe nao apenas no objeto
         */

        //c1.setVelocidadelimite(180);
       Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
