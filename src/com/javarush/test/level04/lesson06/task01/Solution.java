package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        String s_x = bufferReader.readLine();
        int x = Integer.parseInt(s_x);
        String s_y = bufferReader.readLine();
        int y = Integer.parseInt(s_y);
        if (x<y) {
            System.out.println(x);
        }
        else {
            System.out.println(y);
        }

    }
}