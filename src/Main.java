import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1(2024);
        task2(0, 2023);
        int deliveryDistance = -10;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days==-1) {
            System.out.println("Не возможна доставка на расстояние " + deliveryDistance + " км. ");
        }else {
            System.out.println(" Время  доставки " + days + " дней ");
        }
    }

    public static void task1(int year) {
        System.out.println("Задача 1");
        if (isLeapYear(year)) {
            System.out.println(year + " Является високосным годом");
        } else {
            System.out.println(year + " не является високосным годом");
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }


    public static void task2(int os, int productionYear) {
        System.out.println("Задача 2");
        if (os < 0 || os > 1) {
            System.out.println(" OC должны быть равно 0 или 1! ");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        StringBuilder result = new StringBuilder("Установите");
        if (productionYear < currentYear) {
            result.append(" облегчённую версию для ");
        } else {
            result.append(" версию для ");
        }
        if (os == 0) {
            result.append(" IOS ");
        } else {
            result.append(" Android ");
        }
        System.out.println(result);
    }


    private static int calculateDeliveryDays(int deliveryDistance) {
        System.out.println( "Задача 3 ");
        if (deliveryDistance>=0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance>= 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance>60 &&deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}
