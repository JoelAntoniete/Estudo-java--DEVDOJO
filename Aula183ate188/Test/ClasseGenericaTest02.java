package Aula183ate188.Test;

import Aula183ate188.Dominio.Barco;
import Aula183ate188.Service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("usando o barco por um ems ...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
