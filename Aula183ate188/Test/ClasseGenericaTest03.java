package Aula183ate188.Test;

import Aula183ate188.Dominio.Barco;
import Aula183ate188.Dominio.Carro;
import Aula183ate188.Service.ResntalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        ResntalService<Carro> rentalService = new ResntalService<>(carrosDisponiveis);
        ResntalService<Barco> rentalServiceB = new ResntalService<>(barcosDisponiveis);

        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("usando o barco por um ems ...");
        rentalService.retornarCarroAlugado(carro);

        Barco barco = rentalServiceB.buscarObjetoDisponivel();
        System.out.println("usando o barco por um ems ...");
        rentalServiceB.retornarCarroAlugado(barco);

    }
}
