package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception {

        // Для считывания воспользуемся классом Scanner
        // Для вывода - классом PrintWriter
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Считываем размер массива,
        // который необходимо отсортировать


        // Создаем массив размера size
        // для хранения чисел
        int[] a = new int[5];

        // Считываем массив
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());

        }

        // Внешний цикл алгоритма совершает
        // ровно size итераций
        for (int i = 0; i <a.length; i++) {
            // Массив просматривается с конца до
            // позиции i и "легкие элементы всплывают"
            for (int j = a.length - 1; j > i; j--) {
                // Если соседние элементы расположены
                // в неправильном порядке, то меняем
                // их местами
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

        // Выводим отсортированный массив
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }

        // После выполнения программы необходимо закрыть
        // потоки ввода и вывода

    }
}
