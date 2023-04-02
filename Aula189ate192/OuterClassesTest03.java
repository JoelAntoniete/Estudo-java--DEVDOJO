package Aula189ate192;

public class OuterClassesTest03 {
    private String name = "Jose";
    static class Nested{
        void print(){
            //nao conseguirmos chamar o name direto, pois o name nao é um atributo estatic
            //logo precisamos criar  uma instancia da classe e chamar o name por la

            System.out.println(new OuterClassesTest03().name);

        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }
}
