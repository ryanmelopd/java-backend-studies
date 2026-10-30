package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Conversion {
    public static void main(String[] args) {
        Instant data06 = Instant.parse("2026-03-01T01:30:10Z");

        LocalDate resultado1 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
        System.out.println("Resultado da conversão de um Instance para LocalDate: " + resultado1);

        LocalDateTime resultado2 = LocalDateTime.ofInstant(data06, ZoneId.of("Turkey"));
        System.out.println("Resultado da conversão do Instance para o ZoneId da Turquia: " + resultado2);
    }
}