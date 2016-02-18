package R_sender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by vitaliiromanchenko on 18.02.16.
 */
public class long_line
{
    public static void main(String[] args){
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        for (;i < 5;) {
            System.out.print("Введите слово №"+(++i)+": ");
            try {
                list.add(reader.readLine());
            } catch (IOException e) {
                System.out.println("ошибка ввода-вывода");
            } // catch
        } // for

        i = 0;
        int cur, indexOfMax = 0, maxLen = list.get(0).length();
        while (i < list.size()-1) {
            cur = list.get(++i).length();
            if (cur > maxLen) {
                indexOfMax = i;
                maxLen = cur;
            } //if
        } //while
        System.out.println("Слово максимальной длины: "+list.get(indexOfMax)+", длина: "+maxLen);
    }//main
}
