package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader aq = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(aq.readLine());
        int b = Integer.parseInt(aq.readLine());
        int c = Integer.parseInt(aq.readLine());
        int d = Integer.parseInt(aq.readLine());
        if ((a > b) && (a > c) && (a > d))
            System.out.println(a);
        else if ((b > c) && (b > d))
        {
            System.out.println(b);
        } else if (c > d)
        {
            System.out.println(c);
        } else
        {
            System.out.println(d);

        }
    }

}