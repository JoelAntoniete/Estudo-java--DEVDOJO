package Aula161ate.Test;

import Aula161ate.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Attack on titan",52.32));
        mangas.add(new Manga(3L,"Berserk",63.56));
        mangas.add(new Manga(2L, "Hellsing", 12.65));
        mangas.add(new Manga(1L,"Pokemon", 68.56));
        mangas.add(new Manga(4L,"Dragon ball z",85.56));

        Collections.sort(mangas);
        for (Manga m : mangas){
            System.out.println(m);
        }

        Manga mangaToSearch = new Manga(5L, "Attack on titan", 52.32);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
