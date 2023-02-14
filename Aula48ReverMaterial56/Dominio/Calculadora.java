package Aula48ReverMaterial56.Dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void multiplicaDoisNumeros(int n1, int n2){
        System.out.println(n1 * n2);

    }
    public double divideDoisNumeros(double n1,double n2){

        return n1 / n2;

    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println(num1);
        System.out.println(num2);

    }

    public void somaArray (int[] numeros){
        int soma = 0;
        for (int i: numeros) {
            soma += i;
        }
        System.out.println(soma);
    }

    //varArgs ele ira transformar a chamada em um array
    //voce pode colocar outras variaveis no parametro, mas o varArgs tem que ser o ultimo
    public void somaVarArgs(int...numeros){
        int soma = 0;
        for (int i: numeros) {
            soma += i;
        }
        System.out.println(soma);
    }
}
