package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String granFatherName = reader.readLine();
        Cat granFather = new Cat(granFatherName, null, null);

        String granMotherName = reader.readLine();
        Cat granMother = new Cat(granMotherName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, granFather,null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, granMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,catFather ,catMother );

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catFather,catMother);

        System.out.println(granFather);
        System.out.println(granMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat
    {
        private String name;
        private Cat catMother;
        private Cat catFather;



        Cat(String name, Cat catFather, Cat catMother)
        {
            this.name = name;
            this.catFather = catFather;
            this.catMother = catMother;
        }

        @Override
        public String toString()
        {
            String text = "Cat name is " + name;
            if(catFather != null){text+= ", father is " + catFather.name;}
            else {text+= ", no father";}
            if(catMother != null){text+= ", mother is " + catMother.name;}
            else {text+= ", no mother";}


            return text;
        }
    }

}
