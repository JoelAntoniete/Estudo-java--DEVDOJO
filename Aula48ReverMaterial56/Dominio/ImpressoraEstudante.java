package Aula48ReverMaterial.Dominio;

public class ImpressoraEstudante {
    //Passagem de parametro vida referencia


    /*
    Essa é uma classe  que permite que possamos imprimir todos os dados
    ao inves de termos que fazer manualmente
     */
    public void imprime(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
