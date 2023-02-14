package Aula48ReverMaterial.Teste;

import Aula48ReverMaterial.Dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculador = new Calculadora();
        calculador.somaDoisNumeros();
        calculador.multiplicaDoisNumeros(6,8);
        double  resultado = calculador.divideDoisNumeros(8,4);
        System.out.println(resultado);

        /*
        Esse metodo serve pra  mostrar que quando passamos um tipo primitivo
        como parametro ele nao passa a referencia da memoria e sim uma copia
        do valor
         */
        int num1 = 1;
        int num2 = 2;
        calculador.alteraDoisNumeros(num1, num2);
    }
}
