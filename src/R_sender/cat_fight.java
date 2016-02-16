package R_sender;

/**
 * Created by vitaliiromanchenko on 14.02.16.
 */
public class cat_fight
{
    public String name;
    public int age;
    public int weight;
    public int strength;


    public cat_fight(String name, int age, int weight, int strength)//constructor
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.strength=strength;
    }
    public boolean fight23 (cat_fight anotherCat23)
    {
        int incAge = this.age>anotherCat23.age ? 1:0;
        int incWeight = this.weight>anotherCat23.weight ? 1:0;
        int incStrength = this.strength>anotherCat23.strength ? 1:0;
        return (incAge+incWeight+incStrength)>0;
        //Напишите тут ваш код
    }
    public static void main (String [] args) {
        cat_fight CatVaska = new cat_fight("Vaska",12,2,10);
        cat_fight CatBardic = new cat_fight("Bardik",13,3,13);
        if (CatVaska.fight23(CatBardic)) System.out.println("Победа Васьки");
        else System.out.println("Победа Бардика");
    }


}
