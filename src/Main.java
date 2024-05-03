import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        int validYear = 1956;
        determineLeapYearAndPrint(validYear);
        System.out.println("Task 2");
        int clientOS = 0;
        int clientDeviceYear = 2020;
        determineApplicationVersionAndPrint(clientOS, clientDeviceYear);
        System.out.println("Task 3");
        int deliveryDistance = 95;
        int daysDelivery = countDaysDelivery(deliveryDistance);
        if (daysDelivery < 0) {
            System.out.println("Доставки нет.");
        } else System.out.printf("Потребуется дней: %s%n", daysDelivery);
    }

    public static void determineLeapYearAndPrint(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.printf("%s год является високосным.%n", year);
        } else {
            System.out.printf("%s год не является високосным.%n", year);
        }
    }

    public static void determineApplicationVersionAndPrint(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Данная система не поддерживается");
        }
    }

    public static int countDaysDelivery(int distance) {
        int days = 1;
        if (distance < 20) {
            return days;
        } else if (distance < 60) {
            return days + 1;
        } else if (distance < 100) {
            return days + 2;
        } else {
            return -1;
        }

    }


}


