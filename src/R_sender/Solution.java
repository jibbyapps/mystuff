package R_sender;

/**
 * Created by vitaliiromanchenko on 17.02.16.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода: Пример вывода:
3 2
2 3
15 6
6 15
17 17
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] massive = new int[5];

        for (int i = 0; i < massive.length; i++)
            massive[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < massive.length - 1; i++){
        for(int j= i + 1; j < massive.length; j++){
            if(massive[i] > massive[j]){
                int tmp = massive[i];
                massive[i] = massive[j];
                massive[j] = tmp;

            }
        }
    }
        for (int i = 0; i < massive.length; i++)
            System.out.println(massive[i]);
    }
}