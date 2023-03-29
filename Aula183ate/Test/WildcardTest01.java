package Aula183ate.Test;


abstract class Animal{
    public abstract void consulta();
}
class Cachorro extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultado cachorro");
    }
}
class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(),new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        printConsulta(cachorros);
        printConsulta(gatos);

        Animal[] animais = {new Cachorro() , new Gato()};
        printConsulta(animais);
    }

    //vamos usar uma classe mais generica na funcao pra que podemos trabalhar atraves do polimorfismo com varias classes filhas

    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
