package R_sender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by vitaliiromanchenko on 23.02.16.
 */
public class min_max_Arraylist
{

    public static int max(ArrayList<Integer> list){
        int a = list.get(0);
        for (int i = 0; i < list.size(); i++)
        {
            Integer aList = list.get(i);
            int k = aList;
            if (k > a)
            {
                a = k;
            }
        }
        return a;
    }

    public static int min(ArrayList<Integer> list){

        int a = list.get(0);
        for (int i = 0; i < list.size(); i++)
        {

            Integer aList = list.get(i);
          int k = aList;
            if (k < a)
            {
                a = k;
            }
        }
        return a;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++){
            int j = Integer.parseInt(reader.readLine().trim());
            list.add(j);
        }


        int  maximum = max(list);
        int  minimum = min(list);




        System.out.print(maximum);
        System.out.print(" ");
        System.out.print(minimum);
    }
}
