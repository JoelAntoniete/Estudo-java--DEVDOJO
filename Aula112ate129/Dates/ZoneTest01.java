package Aula112ate129.Dates;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        //Essas sao todas as zonas que o java tem suporte
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        System.out.println(ZoneId.systemDefault());  //ele pega a zona do nosso sistema operacional

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo"); //Aqui ele pega a zona que queiramos
        System.out.println(tokyoZone);

        //Adicionar uma zona em uma data
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); //LocalDateTme nao tem zona
        //quando colocamos em uma variavel ele vira um zonedDateTime, pois ele agora é uma data com uma zona
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone); //aqui Adicionamos uma zona na data
        System.out.println(zonedDateTime);

        /*
        Observamos que quando colocamos a zona de tokyo, ele mostra que é mais 9 horas
        assim caso queiramos saber a hora de tokyo  basta adicionar 9 horas
         */

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        //quando sabemos o horario mas nao sabemos a zonna podemos usar ZoneOffset
        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime); //esse metidi tem apenas o offset(-04:00) nao o zone (Manaus)
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime1); //Podemos usar esse metodo que retorna o mesmo que o de cima
        
        //Podemos usar o instant pra adicionar as horas
        Instant nowInstant1 = Instant.now();
        OffsetDateTime offSetDateTimeNow = nowInstant1.atOffset(offsetManaus);
        System.out.println(offSetDateTimeNow);


    }
}
