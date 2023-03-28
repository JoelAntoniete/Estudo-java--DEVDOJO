package Aula161ate183.Test;

import Aula161ate183.Dominio.Consumidor;
import Aula161ate183.Dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("João");
        Consumidor consumidor2 = new Consumidor("Maria");


        Manga manga1 = new Manga(5L, "Attack on titan", 52.32, 0);
        Manga manga2 = new Manga(3L,"Berserk",63.56,5);
        Manga manga3 = new Manga(2L, "Hellsing", 12.65,0);
        Manga manga4 = new Manga(1L,"Pokemon", 68.56,1);
        Manga manga5 = new Manga(4L,"Dragon ball z",85.56,0);

        //associar um consumidor com a compra de um manga
        Map<Consumidor,Manga>consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,manga1);
        consumidorManga.put(consumidor2,manga4);
        consumidorManga.put(consumidor1,manga1);

        //monstrar quais consumidores copraram qual manga
        for (Map.Entry<Consumidor,Manga> entry : consumidorManga.entrySet()){
            //System.out.println(entry.getKey() + " : " + entry.getValue());
            // se colocarmos desta forma, ele mostrara ele se baseara no tostring
            //mostrando todas as informacoes das classes

            System.out.println(entry.getKey().getNome() + " : " + entry.getValue().getNome());
        }
    }

}
