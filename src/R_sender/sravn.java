package R_sender;

/**
 * Created by Vitaliy.Romanchenko on 10.02.2016.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class sravn
{
    public static void main(String[] args) throws Exception
    {
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int max = getMax(getMax(numbers[0], numbers[1]), getMax(numbers[2], numbers[3]));
        System.out.print(max);
    }


    public static int getMax(int a, int b)
    {
        if (a > b)
        {
            return a;
        } else
        {
            return b;
        }

    }

}