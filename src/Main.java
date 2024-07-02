public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Задание №1");

        int mobileOS = 0;
        if (mobileOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (mobileOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("ошибка чтения OS");
        }

        System.out.println(" ");
        System.out.println("Задание №2");

        int clientOS = 0;
        int clientDeviceYear = 2016;
        String operatingSystem;
        if (clientOS == 0) {operatingSystem = "IOS";
        } else  {operatingSystem = "Android";}
        if (clientDeviceYear > 2015) {
            System.out.println("Устоновить версию приложения для " + operatingSystem + " по ссылке");
        } else  {
            System.out.println("Устоновить облегченую версию приложения для " + operatingSystem + " по ссылке" );
        }

        System.out.println(" ");
        System.out.println("Задача №3");

        int year = 2012;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
        System.out.println(" ");
        System.out.println("Задача №4");

        int deliveryDistance = 96;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("доставки нет");
        }
        System.out.println(" ");
        System.out.println("Задача 5");

        int month= 8;
        switch (month) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
        }


    }
}