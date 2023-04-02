package Aula189ate192;

public class OuterClassTest02 {
    private String name = "Maria";

    void print(){
        class LocalClass{
            //Classe dentro do metodo
            String lastName = "Jose"; //o java considera ela como final, assim nao podemos modifica-la
            public void printLocal(String param){
                //caso tenhamos um atributo dentro do metodo, para acessalo, basta  fazer de maneira normal
                System.out.println(param); //O parametro, tbem é um final, e nao pode ser mudada
                System.out.println(name + " " + lastName);

            }
        }
        //para acessar essa classe, precismos inicializar ela no metodo
        new LocalClass().printLocal("Pedro");;

    }
    public static void main(String[] args) {
        //classes locais é quando temos uma classe dentro de um metodo

        OuterClassTest02 outer = new OuterClassTest02();
        outer.print();
    }
}
