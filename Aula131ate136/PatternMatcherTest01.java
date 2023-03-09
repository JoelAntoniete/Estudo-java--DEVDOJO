package Aula131ate136;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        //Para trabalhar com regex precisamos de 2 classe
        //Pattern que é o padrao
        //Matcher que aplica esse padrao


        String regex = "[abcABC]";
        String texto = "abaaba";

        Pattern pattern = Pattern.compile(regex);  //Ele ira compilar o padrao que desejamos
        Matcher matcher = pattern.matcher(texto); //associamos com um matcher

        System.out.println("Texto:  " + texto);
        System.out.println("Indice:  0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posiçoes encontradas");

        //matcher.find() ele retorna true quando encontramos um matcher valido
        while(matcher.find()){
            System.out.println(matcher.start() + " " +matcher.group() ); //ele retorna o primeiro indice do padrao encontrado
            //System.out.println(matcher.group()); //mostra o que foi achado
        }
        // \d = Todos os digitos
        // \D retorna tudo que nao for digito
        // \s \t \f \r  espacos em brando
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z A-Z, digitos, _
        // \W = tudo que nao foi incluso no \w
        // range [] = ele procurara todos os itens que estiverem dentro

        //quantificadores
        // ? zero ou uma
        // * zero ou mais
        // + uma oi mais
        //{n,m} de n ate m
        // () agrupamento
        // |  o(v|c)o ele retorna ou ovo ou oco
        //$ fim da linha
        // . (quando ele esta entre dois caracteres 1.3, significa que pode ter qualquer caracter entre 1 e 3)

        //verificar emails validos
        String rx = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])";
        String email = "luffy@hotmail.com, 123jotaro@gmail.com, #@$zoro@gmail, teste@g.mail, sakura@mail";
        Pattern pattern1 = Pattern.compile(rx);
        Matcher matcher1 = pattern1.matcher(email);
        System.out.println("Texto:  " + email);
        System.out.println("Regex:  " + rx);
        System.out.println("Posiçoes encontradas");
        // Aclasse string tem uma opçao de verificar o matche em uma string
        System.out.println("#@$zoro@gmail.com".matches("([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])"));

        while(matcher1.find()){
            System.out.print(matcher1.start() + "  "); //ele retorna o primeiro indice do padrao encontrado
            System.out.println(matcher1.group()); //mostra o que foi achado
        }


    }
}
