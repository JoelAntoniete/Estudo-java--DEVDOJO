package Aula161ate.Test;

import Aula161ate.Dominio.Manga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"Attack on titan",52.32, 0));
        mangas.add(new Manga(3L,"Berserk",63.56,5));
        mangas.add(new Manga(2L, "Hellsing", 12.65,0));
        mangas.add(new Manga(1L,"Pokemon", 68.56,1));
        mangas.add(new Manga(4L,"Dragon ball z",85.56,0));

        for (Manga manga: mangas) {
            System.out.println(manga);
        }

        //o hashSet ele elimina os itens duplicados, e para uisso ele usa os itens que estao declarados no equals()
        //o HashSet nao mantem a ordem de insercao, caso precisamos da ordem podemos fazer da seguinte forma:
        //Set<Manga> mangas = new LinkedHashSet<>();
    }
}
