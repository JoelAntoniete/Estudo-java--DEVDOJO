package Aula161ate.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        Collections.sort(numeros); //precisamos ordenar a lista primeiro

        //(-(ponto de incerção)-1)
        System.out.println(Collections.binarySearch(numeros, 2));
    }
}
