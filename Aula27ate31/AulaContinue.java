package Aula27ate31;

public class AulaContinue {
    public static void main(String[] args) {
        //dado o valor d eum carro , descubra quantas vezes ele pode ser parcelado
        //o valor da parcela tem que ser maior ou igual a 1000

        double valor = 23568.79;
        for (int i = (int)valor; i >= 1; i--){
            double parcela = valor / i;

            if(parcela < 1000){
                continue;
            }
            System.out.println("Parcela de " + i + "X de R$" + parcela);

        }
    }
}
