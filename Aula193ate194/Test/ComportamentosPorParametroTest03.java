package Aula193ate194.Test;

import Aula193ate194.Dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentosPorParametroTest03 {

    private static List<Car> cars = List.of(
            new Car("Green", 2011),
            new Car("Black", 1998),
            new Car("Red", 2019));

    public static void main(String[] args) {
        List<Car> greenCars2 = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> yearCars = filter(cars, car -> car.getYear() < 2015);

        System.out.println(greenCars2);
        System.out.println(redCars);
        System.out.println(yearCars);

        //podemos filtrar qualquer objeto
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    //um metodo generico que podemos filtrar qualquer coisa
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        //Nos criamos uma interface CarPredicate, mas o java ja tem uma interface Predicate padrao
        List<T> filteredList  = new ArrayList<>();
        for (T e:list) {
            if(predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
