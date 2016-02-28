package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{



    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();

        map.put("er", "erer23");
        map.put("wee", "iiooi12");
        map.put("vbvbv", "ewwwe434");
        map.put("jujuj", "iiooi45");
        map.put("lolo34", "xcxc4545");
        map.put("lolo3", "wewee56");
        map.put("bbh", "tbhtb565");
        map.put("uyu", "iiooi44");
        map.put("lolo4545", "lololo3545");
        map.put("wewewe", "eererw5767");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        int count = 0;
        for (String tmp : map.values())
        {
            if(name.equals(tmp))
            {
                count++;
            }
        }
        return count;
    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        return map.containsKey(familiya) ? 1 : 0;
    }
}
