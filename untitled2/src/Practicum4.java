import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

class Practicum4 {
    public static void main(String[] args) {
        String input = "14 часов 09 минут. Месяц: 02, День: 14, Год: 1966.";
        printCorrectDateTime(input);
    }

    private static void printCorrectDateTime(String input) {
        // Определяем входной формат
        DateTimeFormatter inputFormatter = new DateTimeFormatterBuilder()
                .appendLiteral(" ")
                .appendPattern("H 'часов' m 'минут. Месяц:' MM, 'День:' dd, 'Год:' yyyy.")
                .toFormatter(Locale.ENGLISH);

        // Сконвертируем исходную строку в LocalDateTime
        LocalDateTime dateTime = LocalDateTime.parse(input, inputFormatter);

        // Определяем выходной формат
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd_MM_yyyy|'HH:mm'");

        // Выводим результат на экран
        System.out.println(dateTime.format(outputFormatter));
    }
}
