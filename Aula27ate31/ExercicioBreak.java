package Aula27ate31;

public class ExercicioBreak {
    public static void main(String[] args) {
        //dado o valor d eum carro , descubra quantas vezes ele pode ser parcelado
        //o valor da parcela tem que ser maior ou igual a 1000

        double valor  = 203562.12;

        for(int i = 1; i <valor; i++){
            double valorParcela = valor / i;
            if(valorParcela >= 1000) {
                System.out.println("Parcela de " + i + "X de R$" + valorParcela);
            }else{
                break;
            }
        }



    }
}
