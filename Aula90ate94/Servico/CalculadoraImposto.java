package Aula90ate94.Servico;

import Aula90ate94.Dominio.Computador;
import Aula90ate94.Dominio.Produto;
import Aula90ate94.Dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador" + computador.getNome());
        System.out.println("Valor do computador" + computador.getValor());
        System.out.println("Imposto a ser pago" + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate" + tomate.getNome());
        System.out.println("Valor do Tomate" + tomate.getValor());
        System.out.println("Imposto a ser pago" + imposto);
    }

    //Parametros polimorficos
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
        if(produto instanceof Tomate){
            //instanceof verifica se o produto é uma instancia de tomate
            Tomate tomate = (Tomate) produto; //podemos fazer um, cast de um objeto mais especifico para um menos especifico
            System.out.println(tomate.getDataValidade());
        }
    }
}
