import java.util.Scanner;
public class Main {

    static void plus() {
        Scanner input = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.print("Sayısı giriniz : ");
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
            System.out.println(" Toplam : " + result);
        }
        System.out.println(" Toplam : " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        int result = 0, counter = 0;
        while (true) {
            System.out.print(" Kaç sayı gireceksiniz : ");
            counter = input.nextInt();
            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayınız : ");
                int number = input.nextInt();
                if (i == 1) {
                    result += number;
                    continue;
                }
                result -= number;
            }
            System.out.println("Fark : " + result);
            break;
        }
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        int result = 1, i = 1;
        System.out.println("işlem sonucunu görmekiçin 1'1 tuşlayın!");
        while (true) {
            System.out.print(i++ + ".sayı : ");
            int number = input.nextInt();

            if (number == 1) {
                break;
            }
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("çarpım : " + result);
    }

    static void divide() {
        double result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("kaç sayı gireceksiniz : ");
        int counter = input.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayısınız : ");
            int number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            if (number == 0) {
                System.out.println("bölen sıfır olamaz");
                continue;
            }
            result /= number;
        }
        System.out.println("bölüm sonucu : " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.print("hangi sayının üssünü almak istersiniz : ");
        int number = input.nextInt();
        System.out.print("kaçıncı dereceden üs alacaksınız : ");
        int us = input.nextInt();

        if (number == 0) {
            result = 0;
        }
        for (int i = 1; i <= us; i++) {
            if (us == 0) {
                result = 1;
            }
            result *= number;
        }
        System.out.println(number + " sayısının " + us + "dereceden üssü : " + result);
    }

    static void factoriel() {
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.print("hangi sayının faktöriyelini almak istersiniz : ");
        int number = input.nextInt();
        int temp = number;
        if (number == 0) {
            result = 0;
        }
        for (int i = 1; i <= number; i++) {
            result *= temp;
            temp--;
        }
        System.out.println(number + " sayısının faktöriyeli : " + result);
    }

    static void mod() {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        a = scan.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        b = scan.nextInt();
        System.out.println(a % b);

    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);

        System.out.print("dikdörtgenin ilk kenar değerini giriniz : ");
        int number1 = input.nextInt();

        System.out.print("dikdörtgenin ikinci kenar değerini giriniz : ");
        int number2 = input.nextInt();

        int area = number1 * number2;
        System.out.println(number1 + " ve " + number2 + " değerli dikdörtgenin alanı " + area);

        int perimeter = 2 * (number1 + number2);
        System.out.println(number1 + " ve " + number2 + " değerli dikdörtgenin çevresi " + perimeter);


    }

    public static void main(String[] args) {
        String menu = "1 - Toplama işlemi\n" +
                "2 - çıkarma işlemi\n" +
                "3 - çarpma işlemi\n" +
                "4 - bölme işlemi\n" +
                "5 - üslü sayı hesaplama\n" +
                "6 - faktöriyel hesaplama\n" +
                "7 - mod alma\n" +
                "8 - dikdörtgen alan ve çevre hesabı\n" +
                "0 - çıkış yap\n";
        System.out.println("-------------------------------------");
        System.out.println(menu);
        System.out.println("--------------------------------------");

        int select;
        Scanner scan = new Scanner(System.in);
        System.out.print("hangi işlemi yapmak istiyorsunuz : ");
        select = scan.nextInt();

        do {
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factoriel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("yanlış değer girdiniz, tekrar deneyiniz ! ");
            }


        }while(select !=0);

    }
}
