package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String a = "S";
        String b = "S";
        int n = 10;
        int i = 1;
        int f = 1;
        while (f <= n)
        {
            while (i < n)
            {
                System.out.print(b);
                i++;
            }
            System.out.println(a);
            f++;

            i=1;
        }


    }

}