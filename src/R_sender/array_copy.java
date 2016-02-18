package R_sender;

import java.util.Arrays;

/**
 * Created by vitaliiromanchenko on 18.02.16.
 */
public class array_copy
{
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] copied = new int[2];
        System.arraycopy(arr, 0, copied, 2, 2);//5 is the length to copy

        System.out.println(copied);

    }
}
