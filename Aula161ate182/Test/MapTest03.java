package Aula161ate182.Test;

import Aula161ate182.Dominio.Consumidor;
import Aula161ate182.Dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("João");
        Consumidor consumidor2 = new Consumidor("Maria");


        Manga manga1 = new Manga(5L, "Attack on titan", 52.32, 0);
        Manga manga2 = new Manga(3L,"Berserk",63.56,5);
        Manga manga3 = new Manga(2L, "Hellsing", 12.65,0);
        Manga manga4 = new Manga(1L,"Pokemon", 68.56,1);
        Manga manga5 = new Manga(4L,"Dragon ball z",85.56,0);

        //caso queiramos colocar mais de um valor associado a uma chave
        List<Manga> mangaConsumidor1List = List.of(manga1,manga2,manga3); //uma maneira de ja por os valores na lista
        List<Manga> mangaConsumidor2List = List.of(manga3,manga4,manga5);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangaConsumidor1List);
        consumidorManga.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry:consumidorManga.entrySet()) {
            System.out.println("-----" + entry.getKey().getNome() + "-----");
            for (Manga manga: entry.getValue()) {
                System.out.println(manga.getNome());
            }
        }

    }

}
