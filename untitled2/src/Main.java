
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        long millis = 9_000_000_000L; // количество миллисекунд

        // Дата millis миллисекунд после Unix-эпохи
        Instant futureDate = Instant.ofEpochMilli(millis);

        // Дата millis миллисекунд до Unix-эпохи
        Instant pastDate = Instant.ofEpochMilli(-millis);

        System.out.println(futureDate); // вывод будущей даты
        System.out.println(pastDate);    // вывод прошедшей даты
    }
}
