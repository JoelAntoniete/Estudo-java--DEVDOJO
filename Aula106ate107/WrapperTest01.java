package Aula106ate107;

public class WrapperTest01 {
    public static void main(String[] args) {
        //Tipos primitivos padrao
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 1F;
        double doubleP = 1D;
        char charP = '1';
        boolean booleanP = true;

        //Classes Wrapper
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 1D;
        Character charW = '1';
        Boolean booleanW = true;
        //autoboxing é o qur fizemos acima, transformar em tipo primitivo em um wrapper

        int i =intW;  //unboxing é quando transformamos em um tipo primitivo em um wrapper
        long l = intW.longValue(); //Podemos usar os metodos da classe wrapper tbem
        Integer intW2 = Integer.parseInt("1"); //Transformar uma string em um int
        boolean verdadeiro = Boolean.parseBoolean("TruE"); //transforma String em boolean e nao é case-sensitive
        System.out.println(verdadeiro);

        //saber se é um digito
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(123));

        //sabe se é uma letra ou digito
        System.out.println(Character.isLetterOrDigit('A'));
        System.out.println(Character.isLetterOrDigit('6'));
        System.out.println(Character.isLetterOrDigit('!'));

        //sabe se é letra maiuscula ou minuscula
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));

        //Tranformar em letra maiuscula ou minuscula
        System.out.println(Character.toLowerCase('C'));
        System.out.println(Character.toUpperCase('f'));
    }
}
