package Aula95ate105.Dominio;

public class Funcionario extends Pessoa {

    public void salvar(){
        /*
        qunando voce esta sobrescrevend um metodo voce nao é obrigado a declarar as mesmas exceçoes que o metodo declariou
        , podemos tbem colocar apenas uma exceçao ou colocar novas , porem o que nao é permitido é colocarmos uma exceção
        mais genericas do que as que foram declaradas na classe mae e tbem nao podemos colocar nenhuma exceção do tipo
       checked que nao foi declarado na classe mae
         */
        System.out.println("Salvando Funcionario");
    }
}
