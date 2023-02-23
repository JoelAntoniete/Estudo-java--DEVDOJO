package Aula90ate94.Teste;

import Aula90ate94.Dominio.Computador;
import Aula90ate94.Dominio.Televisao;
import Aula90ate94.Dominio.Tomate;
import Aula90ate94.Servico.CalculadoraImposto;

public class ProdutoTest01 {
    //introdução a polimorfismo
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Italiano", 12);
        Computador computador = new Computador("NUC10I7", 11000);

        //se criarmos metodos estaticos nao precisamos criar o objeto pra chama-lo
        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);

        //Podemos usar a classe mae pra criar metodos mais genericos
        Televisao tv = new Televisao("Samsung", 2000);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tv);
    }
}
