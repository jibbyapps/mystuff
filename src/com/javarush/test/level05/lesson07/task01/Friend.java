package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String name;
    private int age;
    private char gender;


    public void initialize (String name)
    {

        this.name = name;


    }
    public void initialize (int age,String name )
    {
        this.age = age;
        this.name = name;


    }
    public void initialize (char gender)
    {

        this.gender = gender;


    }
}
