package R_sender;

/**
 * Created by vitaliiromanchenko on 16.02.16.
 */
public class rockk
{
    String name = "fr";

    rockk(String name)
    {
        this.name = name;
    }

    protected void finalize() throws Throwable
    {
        System.out.println(name + " destroyed");
    }
}
