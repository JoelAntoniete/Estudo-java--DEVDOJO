package Aula161ate183.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTes01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("D");
        fila.add("B");
        fila.add("A");
        fila.add("C");

        for (String s:fila) {
            System.out.println(s);
            //nao necessariamente quando imprimirmos ele estara em ordem
            //  a ordem so é preservada quando nos tiramos o item da fila
        }
        System.out.println("------------------");

        while(!fila.isEmpty()){
            System.out.println(fila.peek()); //apenas mostra o primeiro item da fila
            System.out.println(fila.poll()); //retira o primeiro  item da fila
        }

    }
}
