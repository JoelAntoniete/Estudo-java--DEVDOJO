package Aula183ate.Test;

import Aula183ate.Dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    // uma maneira de fazer um metodo generico sem ter que fazer a classe
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa"));

    }
    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list= List.of(t);
        System.out.println(list);
    }
}
