package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOne = Integer.parseInt(reader.readLine());
        int numberTwo = Integer.parseInt(reader.readLine());
        int numberThree = Integer.parseInt(reader.readLine());
        int numberFour = Integer.parseInt(reader.readLine());

        int maxOne = Maximum(numberOne, numberTwo);
        int maxTwo = Maximum(numberThree, numberFour);
        System.out.println(Maximum(maxOne, maxTwo));
    }
    public static int Maximum(int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}
