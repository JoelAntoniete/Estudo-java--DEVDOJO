package Aula48ReverMaterial56.Dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    //Na aula 51 , nos foi ensinado a por o metodo de imprime na propria classe

    //Quando queremos pegar uma informacao do proprio metodo, usamos o this

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

}
