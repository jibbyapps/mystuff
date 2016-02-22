package R_sender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by vitaliiromanchenko on 19.02.16.
 */
public class delete_more5
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

        for (int i = 0; i < list.size(); )  //убрали увеличение i внутрь цикла
        {
            if (list.get(i) > 5)
                list.remove(i);  //не увеличиваем i, если удалили текущий  элемент
            else
                i++;
        }
    }
}
