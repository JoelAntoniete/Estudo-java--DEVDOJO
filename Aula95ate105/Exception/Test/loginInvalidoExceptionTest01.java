package Aula95ate105.Exception.Test;

import Aula95ate105.Dominio.LoginInvalidoException;

import java.util.Scanner;

public class loginInvalidoExceptionTest01 {
    //Exceção custumisada
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String userName = "jorge";
        String senha = "1234";
        System.out.println("Usuario: ");
        String userNameDigitado = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaDigitado = scanner.nextLine();

        if(!userName.equals(userNameDigitado) || !senha.equals(senhaDigitado)){
            throw  new LoginInvalidoException("Usuario ou senha invalida");
        }
        System.out.println("Usuario logado com sucesso");
    }
}
