package R_sender;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by vitaliiromanchenko on 28.02.16.
 */
public class vizovmetoda
{
    public static void main(String[] args) throws Exception{
        HashSet<Integer> integerSet = createSet();
        removeAllNumbersMoreThan10(integerSet);
        System.out.println(integerSet);
    }
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> list = new HashSet<Integer>();
        list.add(12);
        list.add(11);
        list.add(1);
        list.add(0);
        list.add(2);
        return list;
    }
    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> list)
    {
      /*  for (Integer isset : list){
            if (isset>10)
                list.remove(isset);
        }//Напишите тут ваш код
        return list;

        */

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
           //iterator.next();
        {
            if (iterator.next() > 10)
            {
                iterator.remove();
            }
        }
        return list;
    }

}
