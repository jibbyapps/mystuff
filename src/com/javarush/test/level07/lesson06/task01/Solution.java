package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rock");
        list.add("blues");
        list.add("rap");
        list.add("soul");
        list.add("pop");

        System.out.println(list.size());

        for (int i=1; i <= list.size(); i++ ){
            System.out.println(list);
        }


        }





    }

