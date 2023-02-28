package Aula108ate111;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String nome2 = "   Luffy   ";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); //retorna um caracter com base no indice
        System.out.println(nome.length()); //retorna o tamanho das strings
        System.out.println(nome.replace("f", "l"));//retorna uma string com os caracteres alterados
        System.out.println(nome.toLowerCase()); //retorna a string com letra minuscula
        System.out.println(nome.toUpperCase()); //retorna a string com letra maiuscula

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2));//ele retorna uma string que vai do indicie 0 ate o 2
        System.out.println(numeros.substring(3,numeros.length()));//retorna um numero da posição 3 ate o final da strinf
        System.out.println(numeros.substring(3));//podemos fazer dessa forma mais simplificada

        System.out.println(nome2.trim()); //remove os valores em branco do começo e do fim da string

    }
}
