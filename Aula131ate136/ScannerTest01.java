package Aula131ate136;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = " Levi, Eric, paula";
        String[] nomes = texto.split(","); //Delimitador

        for(String nome: nomes){
            System.out.println(nome.trim());
        }
    }
}
