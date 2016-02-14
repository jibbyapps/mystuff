package R_sender;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Vitaliy.Romanchenko on 10.02.2016.
 */
public class Login_Validator
{

    public static void main(String[] args)  throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = "v";
        String d = "r";
        String a = (reader.readLine());
        String b = (reader.readLine());


        if (a.equals(c) && b.equals(d))
        {
            System.out.print(" password is valid");
        }
        else
        System.out.println("wrong password");


    }
}
