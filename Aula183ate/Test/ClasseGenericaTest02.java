package Aula183ate.Test;

import Aula183ate.Dominio.Barco;
import Aula183ate.Dominio.Carro;
import Aula183ate.Service.BarcoRentavelService;
import Aula183ate.Service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("usando o barco por um ems ...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
