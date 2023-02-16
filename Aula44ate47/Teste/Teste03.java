package Aula44ate.Teste;

import Aula44ate.Dominio.Calculadora;

public class Teste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
    }
}
