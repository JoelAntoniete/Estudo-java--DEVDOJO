package Aula58Ate.Dominio;

public class Anime {
    private String nome;
    private String genero;
    private String tipo;
    private int episodios;

    private String estudio;

    //Construtor sobrecarregado
    public Anime() {
        System.out.println("Construtor vazio");
    }

    public Anime(String nome, String genero, String tipo, int episodios, String estudio) {
        this(nome,genero,tipo,episodios); //dessas forma ele chama o construtor que ja tem esses parametros
        this.estudio = estudio;
    }

    public Anime(String nome, String genero, String tipo, int episodios) {
        this(); //isso é um meio de chamar um construtor em outro construtor
        this.nome = nome;
        this.genero = genero;
        this.tipo = tipo;
        this.episodios = episodios;
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEspisodios() {
        return episodios;
    }

    public void setEspisodios(int espisodios) {
        this.episodios = espisodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
