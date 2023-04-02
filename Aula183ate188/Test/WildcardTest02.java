package Aula183ate188.Test;

import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
    //fizemos no WildcardTest01 uma implementacao usando arrays, agora faremos usando List
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(),new Gato());

        //Ao tentar implementar desta forma ele apresenta erro com o metodo sem wildcard, por conta do tye erasure
        //como no metodo chamamos a classe mae Animal, ele nao reconhece a classe Cachorro e Gato
        //printConsulta(cachorros);
        //printConsulta(gatos);

        //com o Wildcard
        printConsulta(cachorros);
        printConsulta(gatos);


    }//Método antigo sem Wildcard
    /*private static void printConsulta(List<Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }*/

    // esta maneira é usando o wildecard (?)
    //desta forma ele ira aceitar qualquer classe que seja filha de Animal
    private static void printConsulta(List<? extends Animal> animals){
    //quando passamos um Wildcard como parametro nos perdemos a possibilidade de adicionar algo na lista
    //Agora ela serve apenas para consulta
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    //caso queiramos adicionar algo na lista, usamos o super ao inves de exteds
    private static void printConsultaAnimal(List<? super Animal> animals){
    //Esse metodo apenas mostra que usando o super podemos adicional classes filhas de Animals
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
