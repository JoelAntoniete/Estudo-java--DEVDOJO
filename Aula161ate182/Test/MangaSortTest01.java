package Aula161ate182.Test;

import Aula161ate182.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
caso queiramos trocar o  tipo de comparação de um objeto, caso ja tenhamos implementado
o Comparable, para  nao ocorrer nenhum pproblema podemos criar uma classe, implementar
o Comparator, reescrever o metodo da forma abaixo e colocarmos a classe na assinatura do metodo
sor como escrito abaixo
 */

class SortMangaById implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Attack on titan",52.32));
        mangas.add(new Manga(3L,"Berserk",63.56));
        mangas.add(new Manga(2L, "Hellsing", 12.65));
        mangas.add(new Manga(1L,"Pokemon", 68.56));
        mangas.add(new Manga(4L,"Dragon ball z",85.56));

        //Para conseguimos ordenar uma lista de objetos, alem de implementamos os metodos equals e hashcode
        //precisamos implementar interface Comparable
        //e reescrever o metodo  compareTo

        for(Manga manga: mangas){
            System.out.println(manga);
        }
        System.out.println("----------------------");

        Collections.sort(mangas);

        for(Manga manga: mangas){
            System.out.println(manga);
        }

        System.out.println("----------------------");

        Collections.sort(mangas,new SortMangaById());
        for(Manga manga: mangas){
            System.out.println(manga);
        }

    }
}
