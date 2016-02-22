package R_sender;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by vitaliiromanchenko on 19.02.16.
 */
public class ydvaivaet_L
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        list.add(bis.readLine()); //0
        list.add(bis.readLine()); //1
        list.add(bis.readLine()); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> res = new ArrayList<>();
        for (String s : list)
        {
            if(s.contains("р") && s.contains("л")){
                res.add(s);
            } else if(s.contains("р")){
                //NOP
            } else if(s.contains("л")){
                res.add(s);
                res.add(s);
            } else {
                res.add(s);
            }
        }
        return res;
    }
}
