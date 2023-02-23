package Aula90ate94.Teste;

import Aula90ate94.Dominio.Computador;
import Aula90ate94.Dominio.Produto;
import Aula90ate94.Dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000); //É possivel chamar uma classe direto da classe mar
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("-------------------");

        Produto produto2 = new Tomate("Italiano", 10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
