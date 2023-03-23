package Aula161ate.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing");
        mangas.add("Pokemon");
        mangas.add("Dragon ball z");

        for (String manga: mangas){
            System.out.println(manga);
        }

        System.out.println("-----------------");

        //podemos ordenar usando Collection
        Collections.sort(mangas);

        for (String manga: mangas){
            System.out.println(manga);
        }
    }
}
