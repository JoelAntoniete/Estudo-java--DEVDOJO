package Aula12;

public class Casting {
    // Aula sobre Casting

    public static void main(String[] args) {
        int idade = (int)100000000000L; // fazendo o cast ele força a caber long em um int
        long numeroGrande = (long)100.25;
        double salario = 2000D;
        float salarioFloat = 2500F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean flaso = false;
        char caractere = 'M';

        //Ao fazer um cast, o compilador ira cortar bits pra caber, por isso dar um numero estranho
        System.out.println(idade);

        //Ao forcar um numero float ou double em um int ou long, ele ira ignorar o que vem depois da virgula
        System.out.println(numeroGrande);
    }
}
