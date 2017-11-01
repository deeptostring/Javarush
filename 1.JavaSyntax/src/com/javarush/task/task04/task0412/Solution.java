package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOne = Integer.parseInt(reader.readLine());
        if (numberOne > 0) {
            System.out.println(numberOne * 2);
        }
        if (numberOne < 0) {
            System.out.println(numberOne + 1);
        }
        if (numberOne == 0) {
            System.out.println(0);
        }
    }

}