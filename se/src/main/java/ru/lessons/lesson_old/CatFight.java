package ru.lessons.lesson_old;
/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class CatFight {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kesha", 19, 4, 7);
        Cat cat2 = new Cat("Timka", 23, 5, 6);
        Cat cat3 = new Cat("Una", 10, 6, 5);

        if (cat1.fight(cat2)) System.out.println(cat1.name+ " сильнее " + cat2.name);
        else System.out.println(cat2.name+ " сильнее " + cat1.name);

        if (cat1.fight(cat3)) System.out.println(cat1.name+ " сильнее " + cat3.name);
        else System.out.println(cat3.name+ " сильнее " + cat1.name);

        if (cat2.fight(cat3)) System.out.println(cat2.name+ " сильнее " + cat3.name);
        else System.out.println(cat3.name+ " сильнее " + cat2.name);
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
