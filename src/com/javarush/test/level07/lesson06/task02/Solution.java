package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Reader r = new InputStreamReader(System.in);
        //BufferedReader reader = new BufferedReader(r);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> maxStrAnswer = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int maxLength = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (maxLength < list.get(i).length()){
                maxLength = list.get(i).length();
                maxStrAnswer.clear(); //для того, чтобы в случае нахождения большей строки, в конечном списке у нас не вылезли строчки записанные туда до нее. стандартный сброс списка.
                maxStrAnswer.add(list.get(i));
            }
            else if (maxLength == list.get(i).length()){
                maxStrAnswer.add(list.get(i));
            }
        }

        for (String i : maxStrAnswer) System.out.println(i);

    }
}
