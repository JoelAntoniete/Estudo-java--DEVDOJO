package Aula161ate.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        //Trandformar uma lista em array

        //temos essas duas formas de transformar uma lista em arrays, sendo que a primeira retorna um array de objetos
        //a segunda forma nos colocamos o objeto dentro do toArray, e ele ja retorna um array de inteiros
        //Object[] objects = numeros.toArray();
        Integer[] listToArray = numeros.toArray(new Integer[0]);

        //Transformas um array em lista
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        //formas de transformar arrays em list
        //List<Integer> integers = Arrays.asList(numerosArray);
        // como esse metodo cria um link com o array, nao se pode adicionar usando apenas o add(numero), mas sim usando o add(index, numero)
        ArrayList<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7); //podemos ja criar uma lista com os valores ja nele


    }
}
