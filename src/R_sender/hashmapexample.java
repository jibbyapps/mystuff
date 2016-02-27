package R_sender;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vitaliiromanchenko on 24.02.16.
 */
public class hashmapexample
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
    }
}
