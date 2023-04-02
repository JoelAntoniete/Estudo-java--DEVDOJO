package Aula189ate192;

public class AnonumousClassesTest01 {
    static class Animal{
        public void walk(){
            System.out.println("Animal walking");
        }
    }
    public static void main(String[] args) {
        //classes anonimas sao classes que existirao brevemente, e que nao pode ser utilizada em outro lugar

        Animal animal = new Animal() {
            //desta maneira estamos criando uma subclasse de Animal
            //Assim ela funcionara apenas para modificarmos um funcao, sem ter que criar uma classe filha
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };

        animal.walk();

    }
}
