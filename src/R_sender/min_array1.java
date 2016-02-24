package R_sender;

/**
 * Created by vitaliiromanchenko on 23.02.16.
 */
public class min_array1
{
    public static void main(String[] args){
        int [] loc = {25, 11, 250, 5};
        int max = loc[0];
        int min = loc[0];
        for(int i = 0; i != loc.length; i ++){
            if(loc[i] > max){
                max = loc[i];
            }
            if(loc[i] < min){
                min = loc[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
