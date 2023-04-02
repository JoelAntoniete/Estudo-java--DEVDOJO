package Aula189ate192;

public class OuterClassTest01 {
    private String name = "Joao";
    //Nested class
    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this); //se colocarmos o this ele ira se referenciar pela classe que foi chamado
            System.out.println(OuterClassTest01.this); //esta é a forma de chamarmos o this da classe externa
        }
    }

    public static void main(String[] args) {
        //Classes internas
        OuterClassTest01  outerClassTest = new OuterClassTest01(); //primeiro chamamos a classe de fora
        Inner inner = outerClassTest.new Inner(); //da classe mais externa chamamos a classe interna
        inner.printOuterClassAttribute();

        //outro modo de  chamamos uma classe interna
        Inner inner1 = new OuterClassTest01().new Inner(); //podemos fazer desta forma tbem
    }
}
