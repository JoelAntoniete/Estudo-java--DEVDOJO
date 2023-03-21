package Aula15ate;

public class Operadores {

    //Introdução a Operadores

    public static void main(String[] args) {
        //+ - / *

        int numero1 = 10;
        int numero2 = 20;

        //podemos colocar o resultado em uma variavel
        int soma = numero1 + numero2;

        //podemos colocar o resultado direto no println
        System.out.println(numero2 - numero1);
        System.out.println(numero2 + numero1);

        //operadores relacionais
        //%

        int resto = 20 %2;
        System.out.println(resto);

        //operadores lógicos
        //< > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        //&& (AND) ||(OR) !(NOT)

        //AND
        int idade = 35;
        float salario = 3500F;
        boolean dentroDaRegra = idade > 30 && salario > 4612;
        System.out.println("Dentro da regra " + dentroDaRegra);


        //OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPolpanca = 10000;
        double valorPlayStation = 5000;

        boolean isPlayStationCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPolpanca > valorPlayStation;
        System.out.println("PlayStation é compravel " + isPlayStationCompravel);

        //Operadores de atribuição
        //= += -= /= *= %=

        double bonus = 1800;
        bonus += 2000;
        bonus *= 2;
        System.out.println("valor do bonus " + bonus);

        //operadores unarios
        //--  ++

        int contador = 0;
        contador++; //ele incrementa 1

        contador--; //ele decrementa 1

        /*
        Existe diferenca de colocar o operador unario antes ou depois do nome da variavel
        variavel++, primeiro voce faz o que tem que fazer com a variavel e depois incrementa
        ++variavel , primeiro voce incrementa pra depois fazer o que voce deseja com a variavel
         */

        System.out.println(contador++);
        System.out.println(++contador);
    }
}
