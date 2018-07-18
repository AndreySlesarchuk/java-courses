//package com.javarush.test.level08.lesson11.home06;

/* ��� ����� � �����
1. ������ ����� Human � ������ ��� (String), ��� (boolean), ������� (int), ���� (ArrayList<Human>).
2. ������ ������� � ������� �� ���, ����� ����������: ��� �������, ��� �������, ����, ����, ���� �����.
3. ������� ��� ������� Human �� �����.
*/

import java.util.ArrayList;

public class Family
{
    public static void main(String[] args)
    {
        Human ch1 = new Human("Art", true, 0, new ArrayList<Human>());
        Human ch2 = new Human("Masha", false, 15, new ArrayList<Human>());
        Human ch3 = new Human("Mike", true, 9, new ArrayList<Human>());

        ArrayList<Human> ATmm = new ArrayList<Human>();
        ATmm.add(ch1);
        ATmm.add(ch2);
        ATmm.add(ch3);

        Human father = new Human("Andrey", true, 45, ATmm);
        Human mother = new Human("Tana", false, 45, ATmm);

        ArrayList<Human> Sles = new ArrayList<Human>();
        Sles.add(father);

        Human ded1 = new Human("Vasya", true, 68, Sles);
        Human babushka1 = new Human("Valya", false, 66, Sles);

        ArrayList<Human> Nef = new ArrayList<Human>();
        Nef.add(mother);

        Human ded2 = new Human("Nike", true, 68, Nef);
        Human babushka2 = new Human("Gala", false, 66, Nef);

        System.out.println(ded1);
        System.out.println(ded2);

        System.out.println(babushka1);
        System.out.println(babushka2);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);



    }

    public static class Human
    {
        private String name;
        private Boolean sex;
        private Integer age;
        private ArrayList<Human> children = new ArrayList<Human>();

        Human (String name, Boolean sex, Integer age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

            /*int childCount = children.size();
            if (childCount > 0)
            {
                //this.children = new ArrayList<Human>();
                //this.children.addAll(children);
                this.children = children;
            }
            */
        }


        public String toString()
        {
            String text = "";
            text += "���: " + this.name;
            text += ", ���: " + (this.sex ? "�������" : "�������");
            text += ", �������: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", ����: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
