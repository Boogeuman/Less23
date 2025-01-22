
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.Month.JUNE;

class Practicum {
    public static final int START_YEAR = 2025;
    public static final int START_DAY = 1;
    public static final int MAX_SHIFT = 8;

    public static void main(String[] args) {
        printWorkHours(8, 30, 5, 5);
    }

    private static void printWorkHours(
            int startHours, // час, с которого начинается рабочая смена
            int startMinutes, // минута, с которой начинается рабочая смена
            int shiftContinuation, // продолжительность смены в часах
            int shiftAmount // количество смен
    ) {
        if (shiftContinuation > MAX_SHIFT) { // проверка на максимальную продолжительность смены
            System.out.println("Выбрано слишком большое время для рабочей смены!");
            return;
        }

        System.out.println("Расписание смен:");

        LocalDateTime startTime = LocalDateTime.of(START_YEAR, JUNE, START_DAY, startHours, startMinutes);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        for (int i = 1; i <= shiftAmount; i++) {
            LocalDateTime endTime = startTime.plusHours(shiftContinuation); // вычисление времени окончания смены
            System.out.println("Cмена " + i + ". Начало: " + startTime.format(formatter) + ", конец: " + endTime.format(formatter));
            startTime = endTime; // обновление начала следующей смены
        }
    }
}
