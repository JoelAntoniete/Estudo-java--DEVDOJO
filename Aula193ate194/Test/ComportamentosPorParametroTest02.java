package Aula193ate194.Test;

import Aula193ate194.Dominio.Car;
import Aula193ate194.Interface.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentosPorParametroTest02 {

    //Se reparamos na classe ComportamentosPorParametroTest01 todos os metodos sao identicos e o que muda é apenas a condicao do if

    private static List<Car> cars = List.of(
            new Car("Green", 2011),
            new Car("Black", 1998),
            new Car("Red", 2019));

    public static void main(String[] args) {
        /*
        Aqui criamos uma interface, e colocamos como parametro do metodo,
        e quando formos instanciar esse metodo podemos colocar a regra de negocio que queiramos
         */

        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Green");
            }
        });

        //podemos fazer com lambda tbem
        List<Car> greenCars2 = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> yearCars = filter(cars, car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println(greenCars2);
        System.out.println(redCars);
        System.out.println(yearCars);
    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }


}
