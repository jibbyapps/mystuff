package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    public int left;
    public int top;
    public int width;
    public int height;
    public int rect;

    public Rectangle(int left, int top, int width, int height)
    {
        this.left =left;
        this.height =height;

    }

    public Rectangle(int left, int top)
    {
        this.top = top;
    }

    public Rectangle(int left, int width,int top)
    {
        this.width = width;
    }

    public Rectangle(Rectangle rect)
    {
        this.top =rect.top;



    }

}