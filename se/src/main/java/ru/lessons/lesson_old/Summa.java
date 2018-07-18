//package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Summa
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        while (true)
        {
            String snum1 = reader.readLine();
            if (snum1.equals("summa"))
            {
                System.out.println(s);
                break;
            }
            int m = Integer.parseInt(snum1);
            s = s + m;
        }
    }
}
