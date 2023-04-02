package Aula193ate194.Test;

import Aula193ate194.Dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentosPorParametroTest01 {

    private static List<Car> cars = List.of(
            new Car("Green", 2011),
            new Car("Black", 1998),
            new Car("Red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "Green"));
        System.out.println(filterCarByColor(cars, "Red"));
        System.out.println(filterAge(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        //lista pra filtrar os carros verdes
        List<Car> greenCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                greenCar.add(car);
            }
        }
        return greenCar;
    }

    //caso o cliente queira que façamos um metodo pra cor vermelha tbem ao inves de criarmos um novo metodo
    // podemos criar um metodo e colocar a cor como atributo

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> CarColor = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                CarColor.add(car);
            }
        }
        return CarColor;
    }
    //Caso o cliente queira um metodo de busca pelo ano
    private static List<Car> filterAge(List<Car> cars, int year) {

        List<Car> oldCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() <= year) {
                oldCar.add(car);
            }
        }
        return oldCar;
    }
}
