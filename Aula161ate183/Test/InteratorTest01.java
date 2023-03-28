package Aula161ate183.Test;

import Aula161ate183.Dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Attack on titan",52.32, 0));
        mangas.add(new Manga(3L,"Berserk",63.56,5));
        mangas.add(new Manga(2L, "Hellsing", 12.65,0));
        mangas.add(new Manga(1L,"Pokemon", 68.56,1));
        mangas.add(new Manga(4L,"Dragon ball z",85.56,0));

        //Caso precisamos excluir itens com um aspect, caso usassemos for ele daria um erro
        //sendo assim podemos usar o interator


        Iterator<Manga> mangaIterator = mangas.iterator(); //ele checka antes de execultar uma acao
        while(mangaIterator.hasNext()){
            Manga next = mangaIterator.next(); //ele pega o proximo
            if(next.getQuantidade() == 0){
                mangaIterator.remove(); //como o mangaInterator esta gerenciando, e necessario fazermo o metodo de remover apartir dele
            }
        }

        //fazer a remoção usando programacao funcional
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
    }
}
