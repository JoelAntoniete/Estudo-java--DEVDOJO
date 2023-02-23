package Aula95ate105.Error.Test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        //Introdução a ERROR
        recursividade();

    }

    public static void recursividade(){
        recursividade();
    }
    /*
    Error é algo que aconteceu na JVM e nao é possivel reccuperar em tempo de execução
    */

}
