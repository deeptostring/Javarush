package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOne = Integer.parseInt(reader.readLine());
        int numberTwo = Integer.parseInt(reader.readLine());
        System.out.println(Min(numberOne, numberTwo));
    }
    public static int Min(int a, int b){
        if (a < b){
            return a;
        }
        else {
            return b;
        }

    }
}