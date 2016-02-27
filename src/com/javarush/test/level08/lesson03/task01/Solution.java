package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> hset = new HashSet<String>();


        hset.add("арбуз");
        hset.add("банан");
        hset.add("вишня");
        hset.add("груша");
        hset.add("дыня");
        hset.add("ежевика");
        hset.add("жень-шень");
        hset.add("земляника");
         hset.add("ирис");
        hset.add("картофель");
       // hset.add("дыня");


        //получение итератора для множества
        Iterator<String> iterator = hset.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }

    }
}
