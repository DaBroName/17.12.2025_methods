import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2026;
        checkingLeapYear(year);

        System.out.println("Задача 2");
        char clientOS = 1; // (0 — iOS, 1 — Android)
        int currentYear = LocalDate.now().getYear();
        selectingDeviceOs(clientOS, currentYear);

        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int day = deliveringBankCard(deliveryDistance);
        System.out.println("Потребуется дней: " + day);
    }
    public static void checkingLeapYear(int year) {
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void selectingDeviceOs(char clientOS, int currentYear) {
        if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int deliveringBankCard (int deliveryDistance) {
        int numberOfDays = 0;
        if (deliveryDistance < 20) {
            numberOfDays = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            numberOfDays = 1 + 1;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            numberOfDays = 1 + 1 + 1;
        } else if (deliveryDistance >= 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
        return numberOfDays;
    }
}