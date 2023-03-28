package Aula161ate183.Test;

import Aula161ate183.Dominio.Consumidor;
import Aula161ate183.Dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Joao");
        Queue<Consumidor> consumidorQueue = new PriorityQueue<>();
        //consumidorQueue.add(consumidor); //a classe precisa ter comparable ou comparator


        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator());
        //  ja que é uma fila prioritaria, nos vamos priorizar com base no preco
        //pra isso nos vamos passar o comparator como argumento da chamada da PriorityQueue
        //ele sempre ira ordenar do menor por maior, caso queiramos mudar a intancia da fila deveria ser:
        // Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());

        mangas.add(new Manga(5L,"Attack on titan",52.32));
        mangas.add(new Manga(3L,"Berserk",63.56));
        mangas.add(new Manga(2L, "Hellsing", 12.65));
        mangas.add(new Manga(1L,"Pokemon", 68.56));
        mangas.add(new Manga(4L,"Dragon ball z",85.56));
        mangas.add(new Manga(4L,"Dragon ball gt",85.56));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
