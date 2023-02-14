package Aula48ReverMaterial56.Teste;

import Aula48ReverMaterial56.Dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        //Aula sobre varArgs
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
