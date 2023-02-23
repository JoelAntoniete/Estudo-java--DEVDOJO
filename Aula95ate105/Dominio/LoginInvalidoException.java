package Aula95ate105.Dominio;
//Importante decidimos de qual classe ela ira herdar se é cheched ou uncheged e extendermos a classe
public class LoginInvalidoException extends Exception{
    //Exceções custumizadas

    public LoginInvalidoException() {
        super("Loguin Invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
