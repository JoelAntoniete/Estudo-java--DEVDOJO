package Aula112ate115.Dates;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        //Semelhante a classe date, porem ela trabalha em nanosegundos
        //ela representa um pomto instantaneo dentro de uma timeline
        Instant now = Instant.now(); //ela esta  em zulutime, horario neutro do mundo
        System.out.println(now);
        //Quando precisamos gravar uma data que sirva pra todos mesmo que eu nao saiba qual seu fuso horario.
        System.out.println(LocalDateTime.now());

        //como a Instant trabalha com um instante muito grande de tamanho, o java divide em duas variaveis
        System.out.println(now.getNano());
        System.out.println(now.getEpochSecond() );

    }
}
