package Aula31ate38;

public class AulaArray2 {
    public static void main(String[] args) {
        //valor de inicializacao padrao

        //byte,short,int,long, float e double o valor é 0
        //char o valor é '\u0000' que é um valor em branco
        //boolean false
        // String ou qualquer reference o valor é null

        String[] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "José";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
