import java.time.LocalDate;
import java.time.LocalDateTime;

public class GetData {
    public static void main(String[] args) {
        LocalDate data04 = LocalDate.parse("2022-09-19");
        LocalDateTime data05 = LocalDateTime.parse("2026-03-01T20:09:10");

        System.out.println("Dia da data04: " + data04.getDayOfMonth());
        System.out.println("Mês da data04: " + data04.getMonthValue());
        System.out.println("Ano da data04: " + data04.getYear());

        System.out.println("Hora da data05: " + data05.getHour());
        System.out.println("Minuto da data05: " + data05.getMinute());
        System.out.println("Seguro da data05: " + data05.getSecond());
    }
}