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
    }
    //Сева
    public static ArrayList<Integer> lettersAndNumbers(int numberFirst, int numberSecond) {

        }

        //Вадим. Дописать 3 аргументы в первую строку метода и его реализовать
        public static void workWitchManagers(int salesOne, int salesTwo, int salesThree){
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
