import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2026;
        isLeapYear(year);

        System.out.println("Задача 2");
        char clientOS = 1; // (0 — iOS, 1 — Android)
        int clientYear = 2025; // год выпуска устройства
        selectDeviceOs(clientOS, clientYear);

        System.out.println("Задача 3");
        int deliveryDistance = 150;
        int day = calculateDeliveruDays(deliveryDistance);
    }

    public static void isLeapYear(int year) {
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void selectDeviceOs(char clientOS, int clientYear) {
        int currentYear = LocalDate.now().getYear(); // текущий год
        if (clientOS == 0 && clientYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveruDays(int deliveryDistance) {
        int numberOfDays = 0;
        if (deliveryDistance < 20) {
            numberOfDays = 1;
            System.out.println("Потребуется дней: " + numberOfDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            numberOfDays = 1 + 1;
            System.out.println("Потребуется дней: " + numberOfDays);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            numberOfDays = 1 + 1 + 1;
            System.out.println("Потребуется дней: " + numberOfDays);
        } else if (deliveryDistance >= 100) {
            numberOfDays = 0;
            System.out.println("Свыше 100 км доставки нет");
        }
        return numberOfDays;
    }
}