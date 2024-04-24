package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*
        Вадим
        Написать метод, который принимает строку и
        оставляет в ней только буквы и числа,
        удаляя все остальное.
        Возвращает получившуюся строку.
         */
        String scanner = new Scanner(System.in).nextLine();
        System.out.println(lettersAndNumbers(scanner));

        /*
        Андрей.
        Написать метод для
        обработки кода, который получает два списка целых,
        заполненных случайными числами.
        Код формирует и возвращает новый список,
        содержащий элементы обоих списков без повторений.
         */

        /*
        Рад.
        Написать метод для
        обработки кода,
        который содержит один аргумент –
        строку и распечатать количество букв и цифр в ней.
         */

        /*
        Александр.
        Написать метод, который работает со списком целых, заполненных случайными числами.
        Вам нужно сформировать и распечатать из нового списка:
        1) Минимальный элемент
        2) Максимальный элемент
        3) Число отрицательных элементов
        4) Число положительных элементов
        5) Число нулей
         */
        ArrayList<Integer> list = new ArrayList<>() {{
            add(1);
            add(2);
            add(-1);
            add(0);
            add(3);
        }};
        printMaxAndMinAndCount(list);

        /*
        Сева.
        Написать метод, который принимает два целых числа (границы диапазона),
        формирует список из чисел этого диапазона (включая границы)
        и возвращает сформировавшийся список.
         */

        /*
        Вадим.
        Решить следующую задачу с применением метода:
        Зарплата менеджера составляет 200$ + процент от продаж,
        продажи до 500$ — 3%,
        от 500 до 1000 — 5%,
        свыше 1000 — 8%.
        Метод принимает три аргумента,
        обозначающих уровень продаж для трех менеджеров.
        Определить их зарплату,
        определить лучшего менеджера,
        начислить ему премию 200$,
        вывести итоги в консоль.
         */
        workWitchManagers(700,1200,200);
        /*
        Ульяна.
        Написать метод, который вычисляет площадь и периметр квадрата.
         */

        /*
        Дима.
        Написать метод, который принимает один аргумент –
        целое двухзначное число
        и выводит в консоль каждый его разряд
        на разных строках, а возвращает их сумму.
         */


        /*
        Саша.
        Написать метод, вычисляющий площадь круга,
        по заданному в параметре, радиусу.
         */

        /*
        Михаил
        Написать метод, определяющий счастливое число и
        вернуть true, если - да, и - false - если нет.
         */

    }

    //Вадим
    public static String lettersAndNumbers(String text) {

        String regex = "[a-zA-Z]+";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        String n = " ";
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            n = text.substring(start, end);
        }

        return n;
    }

    //Андрей
    public static String listContainsElementsOtherLists(ArrayList<Integer> listRandomNumbersFirst, ArrayList<Integer> listRandomNumbersSecond) {
        return "";

    }

    //Рад
    public static void printLettersAndNumbers(String text) {

    }

    //Александр
    public static void printMaxAndMinAndCount(ArrayList<Integer> list) {
        int minElement = Collections.min(list);
        int maxElement = Collections.max(list);
        System.out.println("Минимальное число: " + minElement +
                "\nМаксимальное число: " + maxElement);
        int countNegativNumbers = 0;
        int countPositiveNumbers = 0;
        int countZeroNumber = 0;
        for (int number : list) {
            if (number < 0){
                countNegativNumbers++;
            } else if(number > 0){
                countPositiveNumbers++;
            } else if (number == 0) {
                countZeroNumber++;
            }
        }
        System.out.println("Колличество отрицательных чисел = " +countNegativNumbers +
                "\nКолличество положительных чисел = " + countPositiveNumbers +
                "\nКолличество нолей = " + countZeroNumber);
    }
    //Сева
    public static ArrayList<Integer> lettersAndNumbers(int numberFirst, int numberSecond) {

        }

        //Вадим. Дописать 3 аргументы в первую строку метода и его реализовать
        public static void workWitchManagers(int salesOne, int salesTwo, int salesThree){

            int baseSalary = 200;
            double commissionRate1 = 0.03;
            double commissionRate2 = 0.05;
            double commissionRate3 = 0.08;

            double salary1 = baseSalary + salesOne * commissionRate1;
            double salary2 = baseSalary + salesTwo * commissionRate2;
            double salary3 = baseSalary + salesThree * commissionRate3;

            double maxSalary = Math.max(salary1, Math.max(salary2,salary3));

            String bestManager = maxSalary == salary1 ? "Менеджер первый" : (maxSalary == salary2 ? "Менеджер второй" : "Менеджер третий");

            System.out.println("Зарплаты менеджеров:");
            System.out.println("Менеджер один: $" + salary1);
            System.out.println("Менеджер второй: $" + salary2);
            System.out.println("Менеджер третий: $" + salary3);

            int bonusSalary = 200;


            System.out.println("\nЛучший менеджер: " + bestManager + "\nпПолучает премию: " + bonusSalary + "$");
        }

        //Ульяна
        public static void getSquareAndPerimetr() {

        }

        //Дима
        public static int getNumberTwoSybmol(int NumberTwoSybmol) {
            return 0;
        }

        //Саша
        public static double squareCircle(double radius) {
            return 0.0;
        }

        //Михаил
        public static boolean happyNumber(int number) {

        }
    }
}
