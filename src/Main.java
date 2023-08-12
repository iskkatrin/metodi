import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int year = 2021;
        checkLeapYear(year);

        int clientOS = 0;
        int clientDeviceYear = 2015;
        suggestAppVersion(clientOS, clientDeviceYear);

        int deliveryDistance = 95;
        calculateDelivery(deliveryDistance);

    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void suggestAppVersion(int clientOS, int clientDeviceYear) {

        System.out.println("Задание 2");

        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static String calculateDelivery(int deliveryDistance) {

        System.out.println("Задание 3");

        int day = 1;
        if (deliveryDistance <= 20) {

            return "Доставка занимает суток" + day;
        } else if (20 <= deliveryDistance && deliveryDistance <= 60) {

            return "Доставка занимает суток" + (day + 1);
        } else if (60 <= deliveryDistance && deliveryDistance <= 100) {

            return "Доставка занимает суток" + (day + 2);
        } else {

            return "Доставки нет";
        }


    }
}
