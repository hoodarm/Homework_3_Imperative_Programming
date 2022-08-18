package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //Part 1
        for (int i = 10; i <= 37; i = i + 3)
            System.out.println(i);

        //Part 2
        for (int i = 998; i >= 900; i = i - 2)
            System.out.println(i);

        //Part 3
        for (int tracker = 1; tracker <= 20; tracker++)
        {
            if (tracker % 2 == 0)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(1);
            }
        }

        //Part 4
        for (int tracker = 1; tracker <= 60; tracker++)
        {
            if (tracker % 3 == 0)
            {
                System.out.println(9);
            }
            else
            {
                System.out.println(7);
            }
        }
    }
}