package Aula60Ate.Dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    //bloco de inicialização de instancia, ele e execultado cada ver que um objeto é criado
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    public Anime() {
        System.out.println("Dentro do Construtor");
        for (int episodios:this.episodios) {
            System.out.print(episodios + " ");
        }
    }
}
