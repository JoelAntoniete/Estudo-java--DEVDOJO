package Aula183ate188.Service;

import java.util.List;

public class ResntalService<T> {
    //criamos a classe tanto barco como carroRentalService, agora vamos criar algo menos especifico que serve para as 2 classes
    private List<T> objetosDisponiveis;
    public ResntalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }
    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponivel.....");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objeto disponivels para alugar: " );
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarCarroAlugado(T t){
        System.out.println("Devolvendo carro " + t);
        objetosDisponiveis.add(t);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }

}
