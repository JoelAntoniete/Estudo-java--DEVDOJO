package Aula183ate.Test;

import Aula183ate.Dominio.Barco;
import Aula183ate.Dominio.Carro;
import Aula183ate.Service.CarroRentavelService;
import Aula183ate.Service.ResntalService;

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
