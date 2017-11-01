package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN = reader.readLine();
        double nN = Double.parseDouble(sN);

        for (double i = nN; nN >= 5; i--) {
            nN -= 5;
        }

        if (nN >= 0 && nN < 3) {
            System.out.println("зелёный");
        } else if (nN >= 3 && nN < 4) {
            System.out.println("желтый");
        } else {
            System.out.println("красный");
        }
    }
}