package R_sender;

/**
 * Created by vitaliiromanchenko on 12.03.16.
 */

class Apelsin{
    int a,b;
    Apelsin(int x, int y){
        this.a = x;
        this.b = y;
    }
}

class salo extends Apelsin{

    public salo(){
        super(5, 10);
        this.a=5; this.b=10;

    }
}

public class apelsin_super {


    public static void main(String[] args) {

        Apelsin r=new Apelsin(9,36);
        System.out.println(r.a+" "+r.b);

    }


}
