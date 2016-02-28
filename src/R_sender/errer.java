package R_sender;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vitaliiromanchenko on 29.02.16.
 */
public class errer
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i=0; i<10; i++){
            map.put("фамилия"+i, "имя"+i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String,String> pair : map.entrySet()){
            String s = pair.getValue();
            if (s.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count=0;
        for (Map.Entry<String,String> pair : map.entrySet()){
            String s = pair.getKey();
            if (s.equals(familiya)) count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        for (Map.Entry<String,String> pair: map.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
        System.out.println("Фамилия1 встречается " + getCountTheSameLastName(map, "фамилия1"));
        System.out.println("имя7 встречается " + getCountTheSameFirstName(map, "имя7"));
    }
}
