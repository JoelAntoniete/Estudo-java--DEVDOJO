package Aula25e26;

public class Exercicio {
    public static void main(String[] args) {
        //Dados os valores 1 a 7, imprima se é dia util

        byte dia = 7;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Não é dia util");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É dia util");
                break;
            default:
                System.out.println("Valor invalido");
        }
    }
}
