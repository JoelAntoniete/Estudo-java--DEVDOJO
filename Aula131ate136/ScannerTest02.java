package Aula131ate136;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = " Levi, Eric, paula, true, 200";
        Scanner scanner = new Scanner(texto); // o delimitador pradrao é o espaço
        scanner.useDelimiter(","); //Aqui alteramos o delimitador

        while(scanner.hasNext()){
            System.out.println(scanner.next());

            if(scanner.hasNextInt()){
                //aqui ele verifica se é um int
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            }else if(scanner.hasNextBoolean()){
                boolean scan = scanner.hasNextBoolean();
                System.out.println("boolean: " + scan);
            }
        }
    }
}
