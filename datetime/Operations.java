package datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Operations {
    public static void main(String[] args) {
        LocalDate data04 = LocalDate.parse("2022-09-19");
        LocalDateTime data02 = LocalDateTime.parse("2022-09-18T18:09:20");
        Instant data06 = Instant.parse("2026-03-01T01:30:10Z");

        LocalDate semanaPassadaLocalDate = data04.minusDays(7);
        LocalDate proximaSemanaLocalDate = data04.plusDays(7);
        System.out.println("semanaPassadaLocalDate: " + semanaPassadaLocalDate);
        System.out.println("proximaPassadaLocalDate: " + proximaSemanaLocalDate);

        LocalDateTime proximaHoraLocalDateTime = data02.plusHours(1);
        System.out.println("proximaHoraLocalDateTime: " + proximaHoraLocalDateTime);

        Instant proximaSemanaInstant = data06.plus(7, ChronoUnit.DAYS);
        System.out.println("proximaSemanaInstant: " + proximaSemanaInstant);

        Duration tempo1 = Duration.between(proximaHoraLocalDateTime, data02);
        System.out.println("tempo1 horas: " + tempo1.toHours());
    }
}