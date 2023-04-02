package Aula189ate192;

import Aula183ate188.Dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonumousClassesTest02 {

    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha")));
        /*
        Aprendemos que pra ordenar uma llista precisamos que ele extenda comparable ou comparator
        , como barco nao tem comparable, nos criariamos uma classe com comparator e instanciamos ela no sort.
        Podemos usar a classe anonima dentro do sorte, instanciando a interface comparator
         */
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });


    }
}
