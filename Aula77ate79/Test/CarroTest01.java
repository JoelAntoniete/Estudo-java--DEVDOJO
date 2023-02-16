package Aula77ate79.Test;

import Aula77ate79.Dominio.Carro;
import Aula77ate79.Dominio.Ferrari;

public class CarroTest01 {
    // Modificador final - Tipo primitivo

    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        //Modificador final  Tipo referência
        carro.COMPRADOR.setNome("João");
        System.out.println(carro.COMPRADOR);

        /*
        Esse metodo é util quando nao queremos ficar criando objetos, duvidas rever aula 78
        o professor sujere vermos o padrao singleton
         */


        //testando o metodo com final
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Vermelha");
        ferrari.imprime();

    }
}
