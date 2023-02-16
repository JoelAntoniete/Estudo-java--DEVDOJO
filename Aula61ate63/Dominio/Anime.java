package Aula61ate63.Dominio;

public class Anime {
    //ordem de execulção
    //0- Bloco de inicializacao e carregado quando a JVM carregar a classe
    //1- Alocado espaco em memoria pro objeto
    //2- Cada atributo de cladde é criado e inicializado com valores default ou quer  for passado
    //3- Bloco de inicializacao é execultado
    //4- O construtor é execultado

    private String nome;
    private static int[] episodios;

    //aqui ele so execultara apenas uma vez, quando a classe e carregada pela JVM
    static{
        System.out.println("Dentro do bloco estatico de inicializacao");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    {
        System.out.println("Dentro do bloco de inicializacao");
    }

    //dessa forma, cad objeto ira execultar esse codigo, gerando assim um desperdicio de recurso

    /*
    {

        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    */
    public Anime() {
        System.out.println("Dentro do Construtor");
        for (int episodios:Anime.episodios) {
            System.out.print(episodios + " ");
        }
    }
}
