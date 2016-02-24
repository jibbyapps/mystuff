package R_sender;

/**
 * Created by vitaliiromanchenko on 23.02.16.
 */
import java.util.*;

public class bank_tostring
{


    String n;
    String add;
    int an;
    int bal;
    int dep;

    public bank_tostring(String n, String add, int an, int bal)
    {

        this.add = add;
        this.bal = bal;
        this.an = an;
        this.n = n;

    }

    public String toString()
    {
        return "Name of the customer.:" + this.n + ",, "
                + "Address of the customer.:" + this.add + ",, " + "A/c no..:"
                + this.an + ",, " + "Balance in A/c..:" + this.bal;
    }


    public static void main(String[] args)
    {

        List<bank_tostring> l = new LinkedList<bank_tostring>();

        bank_tostring b1 = new bank_tostring("naseem1", "Darbhanga,bihar", 123, 1000);
        bank_tostring b2 = new bank_tostring("naseem2", "patna,bihar", 124, 1500);
        bank_tostring b3 = new bank_tostring("naseem3", "madhubani,bihar", 125, 1600);
        bank_tostring b4 = new bank_tostring("naseem4", "samastipur,bihar", 126, 1700);
        bank_tostring b5 = new bank_tostring("naseem5", "muzafferpur,bihar", 127, 1800);
        l.add(b1);
        l.add(b2);
        l.add(b3);
        l.add(b4);
        l.add(b5);
        Iterator<bank_tostring> i = l.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }


    }
}

