package Aula183ate.Test;

import Aula183ate.Dominio.Carro;
import Aula183ate.Service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("usando o carro por um ems ...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
