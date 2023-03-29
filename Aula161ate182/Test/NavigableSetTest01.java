package Aula161ate182.Test;

import Aula161ate182.Dominio.Manga;
import Aula161ate182.Dominio.Smartphone;

import java.util.*;

//caso precisamos adicionar uma classe que nao temos acesso e ela nao tem op comparable, podemos usar o comparator
 class SmartphoneMarcaComparator implements Comparator<Smartphone>{


    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco()); //maneira de usar o compare com tipos primitivos
    }
}


public class NavigableSetTest01 {
    public static void main(String[] args) {
        //como estamos tentando forcar a Classe Smartphone, temos que colocar o comparator como argumento
        NavigableSet<Smartphone>set = new TreeSet<>(new SmartphoneMarcaComparator());

        //como a treeSet esta ligado a parte o treeSort, é importante que a classe implemente comparable
        Smartphone smartphome = new Smartphone("123", "nokia");
        set.add(smartphome);

        //Como a classe manga tem comparable, podemos fazer da maneira tradicional
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"Attack on titan",52.32));
        mangas.add(new Manga(3L,"Berserk",63.56));
        mangas.add(new Manga(2L, "Hellsing", 12.65));
        mangas.add(new Manga(1L,"Pokemon", 68.56));
        mangas.add(new Manga(4L,"Dragon ball z",85.56));
        mangas.add(new Manga(4L,"Dragon ball gt",85.56));

        for (Manga manga:mangas) {
            System.out.println(manga);
            //ele esta imprimindo em ordem alfabetica, ja que o compareTo esta comparado com o nome
            //ele vai fazer a ordenação com base no compareTo
            //o TreeSet ele diferente do hashSet ele nao usa como parametro pra saber se um item é igual ao outro como o hashSet
            //ele usa o compareTo ao inves do equals, sendo assim, ele so vai eliminar se os nomes forem iguais
            //pois o compareTo esta usando como atributo de comparacao o nome
        }
        System.out.println("---------------------------------------");

        //Agora estamos comparando com base no preco
        NavigableSet<Manga> mangas2 = new TreeSet<>(new MangaPrecoComparator());
        mangas2.add(new Manga(5L,"Attack on titan",52.32));
        mangas2.add(new Manga(3L,"Berserk",63.56));
        mangas2.add(new Manga(2L, "Hellsing", 12.65));
        mangas2.add(new Manga(1L,"Pokemon", 68.56));
        mangas2.add(new Manga(4L,"Dragon ball z",85.56));
        mangas2.add(new Manga(4L,"Dragon ball gt",85.56));

        //lower  (ele traz o que é imediatamente menor (<))
        //floor (ele traz o que é imediatamente menor ou igual(<=))
        //higher (ele traz o que é imediatamente maior (>))
        //ceiling (ele traz o que é imediatamente maior ou igual(=>))

        Manga yoyo = new Manga(21L, "Yuyu Hakusho", 70); //é o que vamos usar de parametro
        System.out.println(mangas2.floor(yoyo));
        System.out.println(mangas2.lower(yoyo));
        System.out.println(mangas2.ceiling(yoyo));
        System.out.println(mangas2.higher(yoyo));
        System.out.println("---------------------------------");

        //Retirar os elementos da lista um por um
        System.out.println(mangas2.size());
        System.out.println(mangas2.pollFirst()); //vai retornar o primeiro elemento da lista e remover
        System.out.println(mangas2.size());
    }
}
