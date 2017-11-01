package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(s);
        int sum = 0;
        //Boolean exit = false;

        while (true)
        {
            sum = sum + x;
            s = reader.readLine();
            if (s.equals("сумма"))
                break;
            else
                x = Integer.parseInt(s);

        }
        System.out.println(sum);
    }
}
