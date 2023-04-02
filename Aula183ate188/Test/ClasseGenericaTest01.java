package Aula183ate188.Test;

import Aula183ate188.Dominio.Carro;
import Aula183ate188.Service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("usando o carro por um ems ...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
