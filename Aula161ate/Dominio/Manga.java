package Aula161ate.Dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "o id nao pode ser null"); //uma maneira de nao pomos null como atributo
        Objects.requireNonNull(nome);//podemos colocar apenas o atributo, sem usar a menssagem
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id,nome,preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(manga.preco, preco) == 0 && id.equals(manga.id) && nome.equals(manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public int compareTo(Manga outroManga) {
        //negativo se o this < outroManga
        //se  this == outroManga return 0
        //positivo se this > outroManga

        /*if(this.id <outroManga.getId()){
            return -1;
        }else if(this.id.equals(outroManga)){
            return 0;
        }else{
            return 1;
        }
        */

        //podemos usar desta forma, se o objeto que comparamos estiver implementado COmparable
        //como estamos commparando um Long(generics) ele tem comparable implementado
        //caso compararmos algum tipo primitivo ou um objeto que nao tenha o comparable, precisamos implementar o codigo comentado acima

          return this.nome.compareTo(outroManga.getNome());
    }
}
