package Aula161ate.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("William");
        nomes.add("DevDojo Academy");
        nomes.add("Maratona Java");
        //nomes.remove(1); //podemos passar o indice para remover
        nomes.remove("DevDojo Academy"); //podemos passar o objeto

        nomes2.add("Teste1");
        nomes2.add("Teste2");
        nomes2.add("Teste3");
        nomes2.add("Teste4");

        // Adciionar os itens de uma lista em outra sem usar o  for
        nomes.addAll(nomes2);

        for (String nome:nomes) {
            System.out.println(nome);
        }
        System.out.println("-------------------");
        nomes.add("Suane");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i)); //nao é possivel usar o [] como em um array
        }
    }
}
