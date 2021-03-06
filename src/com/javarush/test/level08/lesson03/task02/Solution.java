package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> hset = new HashMap<String, String>();
        hset.put("арбуз","ягода");
        hset.put("банан","трава");
        hset.put("вишня","ягода");
        hset.put("груша","фрукт");
        hset.put("дыня","овощ");
        hset.put("ежевика","куст");
        hset.put("жень-шень","корень");
        hset.put("земляника","ягода");
        hset.put("ирис","цветок");
        hset.put("картофель","клубень");
        // hset.add("дыня");


        for (Map.Entry<String, String> pair : hset.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + " - " + value);
        }


    }
}
