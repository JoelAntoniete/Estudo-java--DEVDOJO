package Aula64ate70.Teste;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    // Leitura de dados pelo console
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      //  String next = entrada.next(); //next so pega a primeira palavra
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine(); //ele pega toda a linha escrita

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = entrada.next().charAt(0);//pra pegar o primeiro caracter


        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("sexo: " + sexo);
    }
}
