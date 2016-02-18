package R_sender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vitaliiromanchenko on 18.02.16.
 */
public class min_array
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int min = min(array);
        System.out.println(min);
    }
    public static int[] initializeArray() throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[3];
        for(int i = 0; i < list.length; i++){
            String s = read.readLine();
            list[i] = Integer.parseInt(s);
        }//initialize(create and fill) an array here - инициализируйте (создайте и заполните) массив тут
        return list;
    }
    public static int min(int[] array) {
        int min1 = array[0];
        for (int i = 0; i < array.length; i++){
            if (min1 > array[i])
                min1 = array[i];
            //find the min value here - найдите максимальное значение в этом методе
        }
        return min1;


    }
}
